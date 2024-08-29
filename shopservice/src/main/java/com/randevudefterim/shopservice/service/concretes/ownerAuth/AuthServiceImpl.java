package com.randevudefterim.shopservice.service.concretes.ownerAuth;

import com.randevudefterim.shopservice.core.dto.request.owner.LoginRequest;
import com.randevudefterim.shopservice.core.dto.request.owner.RegisterRequest;
import com.randevudefterim.shopservice.core.dto.response.owner.LoginResponse;
import com.randevudefterim.shopservice.core.mapper.OwnerMapper;
import com.randevudefterim.shopservice.entity.Owner;
import com.randevudefterim.shopservice.service.abstracts.ownerAuth.AuthService;
import com.randevudefterim.shopservice.service.abstracts.ownerAuth.OwnerService;
import com.turkcell.tcell.core.security.BaseJwtService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AuthServiceImpl implements AuthService {
    private final PasswordEncoder passwordEncoder;
    private final OwnerService ownerService;
    private final AuthenticationManager authenticationManager;
    private final BaseJwtService baseJwtService;

    public AuthServiceImpl(PasswordEncoder passwordEncoder, OwnerService ownerService, AuthenticationManager authenticationManager, BaseJwtService baseJwtService) {
        this.passwordEncoder = passwordEncoder;
        this.ownerService = ownerService;
        this.authenticationManager = authenticationManager;
        this.baseJwtService = baseJwtService;
    }

    @Override
    public void register(RegisterRequest request) {

        Owner owner = OwnerMapper.INSTANCE.userFromRequest(request);
        owner.setPassword(passwordEncoder.encode(request.getPassword()));
        ownerService.add(owner);

    }

    @Override
    public LoginResponse login(LoginRequest loginRequest) {

        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));

        if (!authentication.isAuthenticated()) {
            throw new RuntimeException("E-posta ya da şifre yanlış");
        }

        UserDetails owner = ownerService.loadUserByUsername(loginRequest.getEmail());
        int userId = ((Owner) owner).getId();
        Map<String, Object> claims = new HashMap<>();
        List<String> roles = owner
                .getAuthorities()
                .stream()
                .map((role) -> role.getAuthority())
                .toList();
        claims.put("roles", roles);
        claims.put("userId",userId);
        String token = baseJwtService.generateToken(loginRequest.getEmail(), claims);


        return new LoginResponse(token, userId);
    }
}

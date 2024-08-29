package com.randevudefterim.shopservice.controller;

import com.randevudefterim.shopservice.core.dto.request.owner.LoginRequest;
import com.randevudefterim.shopservice.core.dto.request.owner.RegisterRequest;
import com.randevudefterim.shopservice.core.dto.response.owner.LoginResponse;
import com.randevudefterim.shopservice.service.abstracts.ownerAuth.AuthService;
import com.randevudefterim.shopservice.service.abstracts.ownerAuth.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {


    private final AuthService authService;
    private final RoleService roleService;

    @PostMapping("register")
    public void register( @RequestBody RegisterRequest request)
    {
        authService.register(request);
    }

    @PostMapping("login")
    public LoginResponse login(@RequestBody LoginRequest request)
    {
        return authService.login(request);
    }
}
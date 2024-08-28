package com.randevudefterim.shopservice.service.concretes.ownerAuth;


import com.randevudefterim.shopservice.core.dto.response.owner.OwnerResponse;
import com.randevudefterim.shopservice.core.mapper.OwnerMapper;
import com.randevudefterim.shopservice.entity.Owner;
import com.randevudefterim.shopservice.repository.OwnerRepository;
import com.randevudefterim.shopservice.service.abstracts.ownerAuth.OwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OwnerServiceImpl implements OwnerService {
    private final OwnerRepository ownerRepository;
    @Override
    public void add(Owner owner) {
     /*   Optional<User> hasEmail = userRepository.findByEmail(user.getEmail());
        if (hasEmail.isPresent())
        {
            throw new BaseBusinessException("User already exists");
        }*/
        ownerRepository.save(owner);
    }

    @Override
    public Optional<Owner> getOwnerById(int id) {
        return ownerRepository.findById(id);
    }


    @Override
    public List<OwnerResponse> getAllOwner() {
        List<Owner> ownerResponse = ownerRepository.findAll();
        return OwnerMapper.INSTANCE.usersFromResponse(ownerResponse);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return ownerRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found with email or password "));
    }
}

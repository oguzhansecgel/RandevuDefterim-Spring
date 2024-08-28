package com.randevudefterim.shopservice.service.abstracts.ownerAuth;

import com.randevudefterim.shopservice.core.dto.response.owner.OwnerResponse;
import com.randevudefterim.shopservice.entity.Owner;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface OwnerService extends UserDetailsService {
    void add(Owner user);

    Optional<Owner> getOwnerById(int id);
    List<OwnerResponse> getAllOwner();
}

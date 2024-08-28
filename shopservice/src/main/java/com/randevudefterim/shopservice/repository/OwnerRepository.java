package com.randevudefterim.shopservice.repository;

import com.randevudefterim.shopservice.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OwnerRepository extends JpaRepository<Owner, Integer> {
    Optional<Owner> findByEmail(String email);
    Optional<Owner> findById(int id);
}

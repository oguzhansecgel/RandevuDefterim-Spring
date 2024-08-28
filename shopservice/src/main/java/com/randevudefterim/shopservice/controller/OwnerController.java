package com.randevudefterim.shopservice.controller;

import com.randevudefterim.shopservice.core.dto.response.owner.OwnerResponse;
import com.randevudefterim.shopservice.service.abstracts.ownerAuth.OwnerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/owners")
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping("/getAllOwners")
    public List<OwnerResponse> getAllOwners() {
        return ownerService.getAllOwner();
    }
}

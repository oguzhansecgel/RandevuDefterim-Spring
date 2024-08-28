package com.randevudefterim.shopservice.controller;

import com.randevudefterim.shopservice.core.dto.request.owner.RoleRequest;
import com.randevudefterim.shopservice.core.dto.response.owner.RoleWithOwnerResponse;
import com.randevudefterim.shopservice.entity.Owner;
import com.randevudefterim.shopservice.entity.Role;
import com.randevudefterim.shopservice.service.abstracts.ownerAuth.OwnerService;
import com.randevudefterim.shopservice.service.abstracts.ownerAuth.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/roles")
@RequiredArgsConstructor
public class RoleController {

    private final RoleService roleService;
    private final OwnerService ownerService;

    @PostMapping("/createRoles")
    public ResponseEntity<Role> addRole(@RequestBody RoleRequest role) {
        Role newRole = roleService.addRole(role);
        return ResponseEntity.ok(newRole);
    }
    @PostMapping("/{userId}/roles/{roleId}")
    public ResponseEntity<RoleWithOwnerResponse> assignRoleToUser(@PathVariable int ownerId, @PathVariable int roleId) {
        Optional<Owner> ownerOptional = ownerService.getOwnerById(ownerId);
        Optional<Role> roleOptional = roleService.getRoleById(roleId);

        if (ownerOptional.isPresent() && roleOptional.isPresent()) {
            Owner owner = ownerOptional.get();
            Role role = roleOptional.get();

            // Rolü kullanıcının rollerine ekle
            owner.getRoles().add(role);

            // Kullanıcıyı güncelle
            ownerService.add(owner); // Bu metodun implementasyonunu kontrol edin

            RoleWithOwnerResponse roleWithUserResponse = new RoleWithOwnerResponse(ownerId, roleId);
            return ResponseEntity.ok(roleWithUserResponse);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
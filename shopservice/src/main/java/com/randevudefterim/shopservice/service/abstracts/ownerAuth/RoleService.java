package com.randevudefterim.shopservice.service.abstracts.ownerAuth;

import com.randevudefterim.shopservice.core.dto.request.owner.RoleRequest;
import com.randevudefterim.shopservice.entity.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {

    Role addRole(RoleRequest request);

    void deleteRole(int id);

    Optional<Role> getRoleById(int id);

    List<Role> getAllRoles();
}
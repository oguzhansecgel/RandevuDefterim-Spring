package com.randevudefterim.shopservice.service.concretes.ownerAuth;

import com.randevudefterim.shopservice.core.dto.request.owner.RoleRequest;
import com.randevudefterim.shopservice.core.mapper.RoleMapper;
import com.randevudefterim.shopservice.entity.Role;
import com.randevudefterim.shopservice.repository.RoleRepository;
import com.randevudefterim.shopservice.service.abstracts.ownerAuth.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Override
    public Role addRole(RoleRequest request) {
        Role role = RoleMapper.INSTANCE.roleFromRequest(request);
        System.out.println("Mapped Role Name: " + role.getName());
        return roleRepository.save(role);
    }

    @Override
    public void deleteRole(int id) {
    }

    @Override
    public Optional<Role> getRoleById(int id) {
        return roleRepository.findById(id);
    }

    @Override
    public List<Role> getAllRoles() {
        return List.of();
    }
}
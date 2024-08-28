package com.randevudefterim.shopservice.core.mapper;

import com.randevudefterim.shopservice.core.dto.request.owner.RoleRequest;
import com.randevudefterim.shopservice.core.dto.response.owner.RoleWithOwnerResponse;
import com.randevudefterim.shopservice.entity.Owner;
import com.randevudefterim.shopservice.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoleMapper {

    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);

    Role roleFromRequest(RoleRequest request);

    @Mapping(source = "roleId", target = "id")
    Role toRole(RoleWithOwnerResponse roleWithOwnerResponse);

    @Mapping(source = "ownerId", target = "id")
    Owner toUser(RoleWithOwnerResponse roleWithOwnerResponse);
}

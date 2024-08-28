package com.randevudefterim.shopservice.core.mapper;

import com.randevudefterim.shopservice.core.dto.request.owner.RegisterRequest;
import com.randevudefterim.shopservice.core.dto.response.owner.OwnerResponse;
import com.randevudefterim.shopservice.entity.Owner;
import com.randevudefterim.shopservice.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Set;

@Mapper
public interface OwnerMapper {


    OwnerMapper INSTANCE = Mappers.getMapper(OwnerMapper.class);

    Owner userFromRequest(RegisterRequest request);

    @Mapping(target = "roleId", source = "roles", qualifiedByName = "mapRolesToRoleId")
    OwnerResponse userFromResponse(Owner owner);
    List<OwnerResponse> usersFromResponse(List<Owner> owners);

    @Named("mapRolesToRoleId")
    default int mapRolesToRoleId(Set<Role> roles) {
        // Implement your logic here. For example, return the ID of the first role if present.
        return roles.isEmpty() ? 0 : roles.iterator().next().getId();
    }
}

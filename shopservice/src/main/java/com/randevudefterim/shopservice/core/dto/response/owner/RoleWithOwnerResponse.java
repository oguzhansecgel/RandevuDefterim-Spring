package com.randevudefterim.shopservice.core.dto.response.owner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoleWithOwnerResponse {
    private int ownerId;

    private int roleId;
}

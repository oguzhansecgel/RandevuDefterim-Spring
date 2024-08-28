package com.randevudefterim.shopservice.core.dto.response.owner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OwnerResponse {
    private int id;
    private String password;
    private String email;
    private int roleId;
}

package com.randevudefterim.shopservice.service.abstracts.ownerAuth;

import com.randevudefterim.shopservice.core.dto.request.owner.LoginRequest;
import com.randevudefterim.shopservice.core.dto.request.owner.RegisterRequest;
import com.randevudefterim.shopservice.core.dto.response.owner.LoginResponse;

public interface AuthService {
    void register(RegisterRequest request);

    LoginResponse login(LoginRequest loginRequest);
}

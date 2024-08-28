package com.randevudefterim.shopservice.service.abstracts.ownerAuth;

import com.randevudefterim.shopservice.core.dto.request.owner.LoginRequest;
import com.randevudefterim.shopservice.core.dto.request.owner.RegisterRequest;

public interface AuthService {
    void register(RegisterRequest request);

    String login(LoginRequest loginRequest);
}

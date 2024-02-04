package ru.netology.diplomacloudservice.services.auth;

import ru.netology.diplomacloudservice.dto.LoginRequest;

public interface AuthService {
    String login(LoginRequest request);
}

package ru.netology.diplomacloudservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.diplomacloudservice.dto.AuthResponse;
import ru.netology.diplomacloudservice.dto.LoginRequest;
import ru.netology.diplomacloudservice.services.auth.AuthService;


@RestController
public class AuthController {

    private final AuthService service;

    public AuthController(AuthService service) {
        this.service = service;
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
        AuthResponse response = new AuthResponse(service.login(request));
        return ResponseEntity.ok().body(response);
    }
}
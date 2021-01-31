package com.example.ATMmodel.controller;

import com.example.ATMmodel.entity.LogInRequest;
import com.example.ATMmodel.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public void logIn(@RequestBody LogInRequest loginRequest) {
        authService.logIn(loginRequest.getAccountNumber(), loginRequest.getPin());
    }

    @DeleteMapping("/logout")
    public void logOut() {
        authService.logOut();
    }

}

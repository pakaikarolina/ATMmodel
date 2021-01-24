package com.example.ATMmodel.controller;

import com.example.ATMmodel.entity.LogInRequest;
import com.example.ATMmodel.service.ATMModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ATMModelController {

    @Autowired
    private ATMModelService atmModelService;

    @PostMapping("/login")
    public void logIn(@RequestBody LogInRequest loginRequest) {
        atmModelService.logIn(loginRequest.getAccountNumber(), loginRequest.getPin());
    }
}

package com.example.ATMmodel.entity;

import lombok.Data;

@Data
public class LogInRequest {
    private String accountNumber;
    private String pin;
}

package com.example.ATMmodel.entity;

import lombok.Data;

@Data
public class LogInRequest {
    private long accountNumber;
    private int pin;
}

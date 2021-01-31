package com.example.ATMmodel.controller;

import com.example.ATMmodel.entity.User;
import com.example.ATMmodel.service.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("transactions")
public class TransactionsController {

    @Autowired
    private TransactionsService transactionsService;

    @PutMapping("/deposit")
    public void depositMoney(@RequestParam int amount) {
        transactionsService.depositMoney(amount);
    }

    @PutMapping("/withdraw")
    public void withdrawMoney(@RequestParam int amount) {
        transactionsService.withdrawMoney(amount);
    }

    @PutMapping("/transfer")
    public void transferMoney(@RequestParam int amount, @RequestParam long accountNumber) {
        transactionsService.transferMoney(amount, accountNumber);
    }
}

package com.example.ATMmodel.service;

import com.example.ATMmodel.entity.User;
import com.example.ATMmodel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ATMModelService {

    private final UserRepository userRepository;
    private User activeUser;

    @Autowired
    public ATMModelService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void logIn(long accountNumber, int pin) {
       activeUser = userRepository.findByAccountNumberAndPin(accountNumber, pin);
    }
}

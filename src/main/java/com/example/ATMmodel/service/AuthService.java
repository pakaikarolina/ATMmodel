package com.example.ATMmodel.service;

import com.example.ATMmodel.entity.User;
import com.example.ATMmodel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepository userRepository;
    private User activeUser;

    @Autowired
    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void logIn(long accountNumber, int pin) {
       activeUser = userRepository.findByAccountNumberAndPin(accountNumber, pin);
    }

    public void logOut() {
        activeUser = null;
    }

    public User getActiveUser() {
        return activeUser;
    }
}

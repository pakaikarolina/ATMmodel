package com.example.ATMmodel.service;

import com.example.ATMmodel.entity.Transaction;
import com.example.ATMmodel.entity.TransactionType;
import com.example.ATMmodel.entity.User;
import com.example.ATMmodel.repository.TransactionsRepository;
import com.example.ATMmodel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionsService {

    @Autowired
    private TransactionsRepository transactionsRepository;
    @Autowired
    private AuthService authService;
    @Autowired
    private UserRepository userRepository;


    public void depositMoney(int amount) {
        Transaction transaction = new Transaction();
        transaction.setAmount(amount);
        transaction.setTransactionType(TransactionType.DEPOSIT);
        transactionsRepository.save(transaction);
        User activeUser = authService.getActiveUser();
        activeUser.getTransactionList().add(transaction);
        activeUser.setBalance(activeUser.getBalance() + amount);
        userRepository.save(activeUser);
    }


    public void withdrawMoney(int amount) {
        Transaction transaction = new Transaction();
        transaction.setTransactionType(TransactionType.WITHDRAW);
        transaction.setAmount(amount);
        transactionsRepository.save(transaction);
        User activeUser = authService.getActiveUser();
        activeUser.getTransactionList().add(transaction);
        activeUser.setBalance(activeUser.getBalance() - amount);
        userRepository.save(activeUser);
    }

    public void transferMoney(int amount, long accountNumber) {
        Transaction transaction = new Transaction();
        transaction.setTransactionType(TransactionType.TRANSFER);
        transaction.setAmount(amount);
        transactionsRepository.save(transaction);
        User activeUser = authService.getActiveUser();
        activeUser.getTransactionList().add(transaction);
        activeUser.setBalance(activeUser.getBalance() - amount);
        User receiver = userRepository.findByAccountNumber(accountNumber);
        receiver.setBalance(receiver.getBalance() + amount);
        userRepository.save(activeUser);
        userRepository.save(receiver);
    }
}

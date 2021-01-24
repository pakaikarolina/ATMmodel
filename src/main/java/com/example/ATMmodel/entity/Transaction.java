package com.example.ATMmodel.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Table
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private int amount;
    private TransactionType transactionType;

    public Transaction(Integer amount, TransactionType transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }


    
}

enum TransactionType {
    DEPOSIT,
    WITHDRAW,
    TRANSFER;
}

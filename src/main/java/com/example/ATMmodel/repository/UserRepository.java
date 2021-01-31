package com.example.ATMmodel.repository;

import com.example.ATMmodel.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, String> {

    public abstract User findByAccountNumberAndPin(long accountNumber, int pin);

    public abstract User findByAccountNumber(long accountNumber);

}

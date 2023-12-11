package com.mindhub.demo.dto;

import java.time.LocalDate;

public class AccountDTO {

    private final Long id;
    private final String number;
    private final LocalDate creationDate;
    private final Double balance;

    public AccountDTO(AccountDTO account){
        this.id = account.getId();
        this.number = account.getNumber();
        this.creationDate = account.getCreationDate();
        this.balance = account.getBalance();
    }

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public Double getBalance() {
        return balance;
    }
}
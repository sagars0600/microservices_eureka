package com.example.customer.model;

import lombok.Data;
import org.springframework.data.annotation.Id;


@Data
public class Account {

    @Id

    private int id;
    private String name;
    private String address;
    private String accountNumber;

    public Account(String name, String address, String accountNumber) {
        this.name = name;
        this.address = address;
        this.accountNumber = accountNumber;
    }
}

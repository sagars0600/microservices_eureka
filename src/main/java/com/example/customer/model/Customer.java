package com.example.customer.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;

@Document(collection="customer")
@Data
public class
Customer {

    @Id
    private int id;
    private String name;
    private String address;
    private String parentName;

    public Customer(String name, String address, String parentName) {
        this.name = name;
        this.address = address;
        this.parentName = parentName;
    }
}

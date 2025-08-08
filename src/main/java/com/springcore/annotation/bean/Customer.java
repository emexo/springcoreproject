package com.springcore.annotation.bean;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class Customer {
    private String name;
    private int age;

    public Customer() {
        log.info("Customer default constructor called");
        this.age = 30; // Default age
        this.name = "Natalia";
    }

    public void printCustomerDetails() {
        log.info("Customer Details - Name: {}, Age: {}", name, age);
    }
}

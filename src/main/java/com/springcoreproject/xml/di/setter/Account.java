package com.springcoreproject.xml.di.setter;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Setter
public class Account {
    private int accountId;
    private String accountType;
    private Customer customer;

    public void getAccountDetails() {
        log.info("Account ID: {}" , accountId);
        log.info("Account Type: {}" , accountType);
        customer.getCustomerDetails();
    }
}


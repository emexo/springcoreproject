package com.springcore.xmlconfig;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Account {
    private int accountId;
    private String accountName;

    public Account(){
        this.accountId = 3333;
        this.accountName = "Gary";
    }

    public void getAccountDetails() {
        log.info("Account ID: " + accountId);
        log.info("Account Name: " + accountName);
    }
}

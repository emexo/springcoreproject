package com.springcore.xml.bean;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Account {
    private int accountId;
    private String accountType;
    private String accountName;

    public Account(){
        this.accountId = 1;
        this.accountName = "Dee";
        this.accountType = "Saving";
    }

    public void getAccountDetails() {
        log.info("Account Details: ID: {} Name: {} Type: {}", accountId, accountName, accountType);
    }
}

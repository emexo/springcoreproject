package com.springcoreproject.xml.di.setter;


import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Setter
public class Customer {
    private String customerId;
    private String CustomerName;

    public void getCustomerDetails() {
        log.info("Customer ID: {}" , customerId);
        log.info("Customer Name: {}" , CustomerName);
    }
}

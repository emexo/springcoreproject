package com.springcore.annotation.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.annotation.bean");
        Customer customer = context.getBean("customer", Customer.class);
        customer.printCustomerDetails();
        ((AnnotationConfigApplicationContext) context).close();
    }
}

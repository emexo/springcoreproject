package com.springcoreproject.annotation.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcoreproject.annotation.componentscan");
        TransactionService service = context.getBean("transactionService", TransactionService.class);
        service.getTransactionDetails();
    }
}

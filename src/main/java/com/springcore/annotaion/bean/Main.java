package com.springcore.annotaion.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore");
        PaymentService paymentService =  context.getBean("paymentService", PaymentService.class);
        paymentService.getPayment();
    }
}

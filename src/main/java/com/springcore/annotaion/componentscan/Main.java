package com.springcore.annotaion.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.annotaion.componentscan");
        Order order = context.getBean("order", Order.class);
        order.placeOrder();
    }
}



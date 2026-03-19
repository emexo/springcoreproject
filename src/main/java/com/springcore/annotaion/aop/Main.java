package com.springcore.annotaion.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.annotaion.aop");
        PassengerDAO passengerDAO = context.getBean("passengerDAOImpl", PassengerDAO.class);
        passengerDAO.getPassenger(1);
    }
}

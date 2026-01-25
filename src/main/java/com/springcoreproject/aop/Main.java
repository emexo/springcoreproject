package com.springcoreproject.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcoreproject.aop");
        PassengerDAO passengerDAO = context.getBean("passengerDAOImpl", PassengerDAO.class);
        Passenger passenger = passengerDAO.getPassengerByPassportNumber("A12345678");
    }
}

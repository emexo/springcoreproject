package com.springcore.annotation.bean;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Log4j2
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.annotation.bean");

        Employee employee = context.getBean("employee", Employee.class);
        employee.setId(1);
        employee.setName("John Doe");
        employee.setAddress("123 Main St");

        log.info("Employee Details:");
        log.info("ID: " + employee.getId());
        log.info("Name: " + employee.getName());
        log.info("Address: " + employee.getAddress());
    }
}

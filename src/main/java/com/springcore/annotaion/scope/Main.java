package com.springcore.annotaion.scope;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

@Log4j2
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.annotaion.scope");
        Employee employee = context.getBean("employee", Employee.class);
        log.info(employee.hashCode());

        Employee employee1 = context.getBean("employee", Employee.class);
        log.info(employee1.hashCode());


    }
}

package com.springcore.annotaion.scope;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Scope in Spring defines the lifecycle and visibility of a bean within the application context. The most common scopes are:
 * - singleton: This is the default scope. Only one instance of the bean will be created
 */
@Log4j2
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.annotaion.scope");
        Employee employee =  context.getBean("employee",Employee.class);
        log.info(employee.hashCode());

        Employee employee2 =  context.getBean("employee",Employee.class);
        log.info(employee2.hashCode());

    }
}

package com.springcore.annotation.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import lombok.extern.log4j.Log4j2;

@Configuration
@Log4j2
public class ScopeMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.annotation.scope");

        // Get employee bean multiple times to demonstrate singleton scope
        Employee emp1 = context.getBean("employee", Employee.class);
        emp1.setId(1);
        emp1.setName("John");
        log.info("First Employee instance: {}", emp1);

        Employee emp2 = context.getBean("employee", Employee.class);
        log.info("Second Employee instance: {}", emp2);

        // This will print true as both references point to the same object (singleton)
        log.info("Are both instances same? {}", (emp1 == emp2));

        context.close();
    }
}

package com.springcoreproject.javabasedconfig;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

@Log4j2
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcoreproject.javabasedconfig");
        Date currentDate = context.getBean("date", Date.class);
        log.info("Current Date: {}" , currentDate);
    }
}

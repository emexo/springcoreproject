package com.springcore.annotaion.propertyfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore");
        PropertyFile propertyFile = context.getBean("propertyFile", PropertyFile.class);
        propertyFile.getDbConnection();
    }
}

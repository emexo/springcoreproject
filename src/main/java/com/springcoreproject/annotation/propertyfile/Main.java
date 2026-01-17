package com.springcoreproject.annotation.propertyfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcoreproject.annotation.propertyfile");

        DbConnection connection = context.getBean("dbConnection", DbConnection.class);
        connection.getDbConnectionDetails();
    }
}

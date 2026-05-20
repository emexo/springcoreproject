package com.springcore.annotaion.postconstructpredestroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.springcore");
        DBConnection dbConnection = context.getBean("DBConnection", DBConnection.class);
        context.close();
    }
}

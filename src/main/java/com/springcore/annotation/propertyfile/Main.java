package com.springcore.annotation.propertyfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.annotation.propertyfile");
        MailConnection mailConnection = context.getBean("mailConnection", MailConnection.class);
        mailConnection.getMailDetails();
    }
}

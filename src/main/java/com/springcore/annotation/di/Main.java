package com.springcore.annotation.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Create Spring container using component scanning
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.annotation.di");

        // Get the User bean from container
        User user = context.getBean("user", User.class);

        // Set user properties
        user.setName("John");
        user.setEmail("john@example.com");

        // Call methods
        user.startJourney();
        user.endJourney();

        // Print user details using lombok generated toString
        System.out.println("User Details: " + user);

        // Close the context
        context.close();
    }
}

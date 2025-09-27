package com.springcore.annotation.postconstructpredestroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.annotation.postconstructpredestroy");
        context.close();
    }
}

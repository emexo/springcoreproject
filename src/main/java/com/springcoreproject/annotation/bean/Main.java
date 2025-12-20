package com.springcoreproject.annotation.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcoreproject");
        Product product = context.getBean("product", Product.class);
        product.getProductDetails();
    }
}

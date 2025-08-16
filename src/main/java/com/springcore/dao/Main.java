package com.springcore.dao;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@Log4j2
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.dao");
        UserDAOImpl userDAO = context.getBean("userDAOImpl", UserDAOImpl.class);

        User retrievedUser = userDAO.getUserById(1);
        log.info( "Retrieved User: {}", retrievedUser);

        ((AnnotationConfigApplicationContext) context).close();
    }
}

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

     /* User user = new User();
        user.setUsername("Gary");
        user.setPassword("gary@123");
        user.setFullName("Gary Gadel");
        user.setEmail("garygadel@gmail.com");

        int response = userDAO.saveUser(user);
        log.info("Response:{}", response);*/

       User user = userDAO.getUserByName("Gary");
       log.info("User:{}", user);
    }
}

package com.springcore.dao;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@Log4j2
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.dao");
        UserDAO userDAO = context.getBean("userDAO", UserDAO.class);

        User user = new User("pravin", "pravin123", "pravin D", "pravin@gmail.com");
        //userDAO.save(user);

        //userDAO.update(11,"Jeevan");

        //userDAO.delete(11);

        //List<User> users = userDAO.findAll();
        //users.forEach(user1 -> log.info(user1));

        User user1 = userDAO.findById(1);
        log.info(user1);
    }
}

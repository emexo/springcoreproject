package com.springcore.annotation.scope;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@Log4j2
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.annotation.scope");

        DbConnection db1 = context.getBean("dbConnection", DbConnection.class);
        DbConnection db2 = context.getBean("dbConnection", DbConnection.class);
        log.info(db1.getId());
        log.info(db2.getId());

    }
}

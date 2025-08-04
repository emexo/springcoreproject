package com.springcore.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("xmlconfig.xml");
        Account account = (Account) context.getBean("account");
        account.getAccountDetails();
    }
}

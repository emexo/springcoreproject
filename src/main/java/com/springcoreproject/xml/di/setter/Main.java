package com.springcoreproject.xml.di.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("setterbased.xml");
        Account account = (Account) context.getBean("account");
        account.getAccountDetails();
    }
}

package com.springcore.annotation.bean;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Log4j2
public class Main {
    public static void main(String[] args) {
        ApplicationContext context  = new AnnotationConfigApplicationContext("com.springcore.annotation.bean");

        Employee emp = context.getBean("emp", Employee.class);
        emp.setEmpId(101);
        emp.setEmpName("John Doe");
        log.info("Employee id:{} and name:{}", emp.getEmpId(), emp.getEmpName());
    }
}

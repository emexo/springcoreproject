package com.springcore.annotation;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@Log4j2
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.annotation");
        Employee employee = context.getBean("employee", Employee.class);
        employee.setEmpId(1);
        employee.setEmpName("test");

        log.info("Emp id:{} and name:{}", employee.getEmpId(), employee.getEmpName());
    }
}

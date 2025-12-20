package com.springcoreproject.xml.bean;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Log4j2
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee employee = context.getBean("employee", Employee.class);

        employee.setEmployeeId(101);
        employee.setEmployeeName("John Doe");

        log.info("Employee id:{} and Employee Name:{}", employee.getEmployeeId(), employee.getEmployeeName());
    }
}

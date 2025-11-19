package com.springcore.xml.bean;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@Log4j2
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext1.xml");

        Employee employee = applicationContext.getBean("emp", Employee.class);

        employee.setEmployeeId(101);
        employee.setEmployeeName("John Doe");
        log.info("Employee ID: " + employee.getEmployeeId());
        log.info("Employee Name: " + employee.getEmployeeName());
    }
}

package com.springcore.annotaion.scope;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Log4j2
@Scope("prototype")
@Component
public class Employee {

    public Employee(){
        log.info("###### Default constructor#######");
    }

    public void getEmployeeDetails(){
        log.info("Employee details");
    }
}

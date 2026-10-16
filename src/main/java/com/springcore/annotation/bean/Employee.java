package com.springcore.annotation.bean;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component("emp")
@Log4j2
public class Employee {
    public void getEmployeeDetails(){
       log.info("Employee details");
    }
}

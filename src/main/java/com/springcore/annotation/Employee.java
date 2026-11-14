package com.springcore.annotation;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Log4j2
@Repository
public class Employee {
    private int empId;
    private String empName;

    public Employee(){
        log.info("Default Constructor");
    }
}

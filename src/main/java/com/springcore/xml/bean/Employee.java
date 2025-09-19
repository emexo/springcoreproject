package com.springcore.xml.bean;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Employee {
    private String empName;
    private int empId;

    public Employee(){
        this.empId =1;
        this.empName="pravin";
    }

    public void getEmployeeDetails(){
        log.info("Employee ID: {} Employee Name: {}", empId, empName);

    }

}

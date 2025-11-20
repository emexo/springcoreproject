package com.springcore.annotation.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component(value = "emp")
@Getter
@Setter
public class Employee {
    private int empId;
    private String empName;
}

package com.springcore.annotation.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Employee {
    private int id;
    private String name;
    private String address;


}

package com.springcore.annotation.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@Component
@Scope("singleton")
@Getter
@Setter
@ToString
@Log4j2
public class Employee {
    private int id;
    private String name;

    public Employee() {
        log.info("Employee object created!");
    }
}

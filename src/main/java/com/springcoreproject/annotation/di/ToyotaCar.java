package com.springcoreproject.annotation.di;

import org.springframework.stereotype.Component;

@Component
public class ToyotaCar implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a Toyota Car");
    }
}

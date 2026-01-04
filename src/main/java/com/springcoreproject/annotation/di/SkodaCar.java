package com.springcoreproject.annotation.di;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class SkodaCar implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Driving a Skoda Car");
    }
}

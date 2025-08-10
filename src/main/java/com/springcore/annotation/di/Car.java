package com.springcore.annotation.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import lombok.Data;

@Primary
@Data
@Component("car")
public class Car implements Vehicle {
    private String brand;
    private String model;

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public String getVehicleType() {
        return "Car";
    }
}

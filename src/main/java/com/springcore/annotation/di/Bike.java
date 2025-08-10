package com.springcore.annotation.di;

import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component("bike")
public class Bike implements Vehicle {
    private String brand;
    private String type;

    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping...");
    }

    @Override
    public String getVehicleType() {
        return "Bike";
    }
}

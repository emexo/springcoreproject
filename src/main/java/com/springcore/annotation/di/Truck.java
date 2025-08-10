package com.springcore.annotation.di;

import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component("truck")
public class Truck implements Vehicle {
    private String brand;
    private double capacity;

    @Override
    public void start() {
        System.out.println("Truck is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopping...");
    }

    @Override
    public String getVehicleType() {
        return "Truck";
    }
}

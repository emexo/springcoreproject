package com.springcore.annotation.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
public class User {
    private String name;
    private String email;

    @Autowired
    private Bike vehicle;

    public void startJourney() {
        System.out.println("User " + name + " is starting journey");
        vehicle.start();
    }

    public void endJourney() {
        System.out.println("User " + name + " is ending journey");
        vehicle.stop();
    }
}

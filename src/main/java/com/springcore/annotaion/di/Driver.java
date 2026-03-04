package com.springcore.annotaion.di;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Driver class that depends on the Vehicle interface.
 * The specific implementation of Vehicle will be injected by Spring.
 *
 * @Autoired
 * Match by Type: Spring will look for a bean that implements the Vehicle interface and inject it.
 * If there are multiple implementations (like KiaCar, SkodaCar, TataCar),
 * Spring will throw an exception unless we specify which one to use (e.g., by using @Qualifier or by marking one as @Primary).
 * Match by Qualifier: If we have multiple implementations of Vehicle, we can use @Qualifier to specify which one to inject.
 * Match by Name: If we have multiple beans of the same type,
 * Spring can also match by the bean name (the default bean name is the class name with the first letter in lowercase).
 */

@Component
@Log4j2
public class Driver {

    @Qualifier("kiaCar")
    @Autowired
    private Vehicle tataCar ;

    public void driveVehicle() {
        log.info("Driver is driving the vehicle...");
        tataCar.drive();
    }
}

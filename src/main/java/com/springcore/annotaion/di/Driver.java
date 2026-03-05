package com.springcore.annotaion.di;

import jakarta.annotation.Resource;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

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
 *
 * @Inject
 * The @Inject annotation is part of the Java Dependency Injection (JSR-330) specification and serves a similar purpose to @Autowired.
 * It can be used to inject dependencies in a similar way to @Autowired, but it does not have the same features (like required=false) and is not specific to Spring.
 * In Spring, you can use either @Autowired or @Inject for dependency injection, but @Autowired is more commonly used and provides more features specific to Spring.
 * Match by Type: Similar to @Autowired, Spring will look for a bean that matches the type of the dependency and inject it.
 * Match by Qualifier: If there are multiple beans of the same type, you can use @Named (from JSR-330) to specify which bean to inject, similar to @Qualifier in Spring.
 * Match by Name: Similar to @Autowired, Spring can also match by the bean name when using @Inject, but it is less common and not as flexible as using @Autowired with @Qualifier.
 *
 * @Resource
 * The @Resource annotation is part of the Java EE specification and is used for dependency injection. It can be used to inject dependencies by name or by type.
 * Match by Name: By default, @Resource will match by the name of the bean. If you specify a name in the @Resource annotation, Spring will look for a bean with that name and inject it.
 * Match by Type: If no name is specified in the @Resource annotation, Spring will attempt to match by type. However, if there are multiple beans of the same type, Spring will throw an exception unless you specify
 * which one to use (e.g., by using @Qualifier or by marking one as @Primary).
 */

@Component
@Log4j2
public class Driver {


    @Resource
    private Vehicle vehicle ;


    public void driveVehicle() {
        log.info("Driver is driving the vehicle...");
        vehicle.drive();
    }
}

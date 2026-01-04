package com.springcoreproject.annotation.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Autowired is used for automatic dependency injection.
 * Match by Type - Spring container looks for a bean of the same type and injects it.
 * Match by Name - If multiple beans of the same type exist, Spring looks for a bean with the same name as the field.
 * Match by @Qualifier - If multiple beans of the same type exist, use @Qualifier to specify which bean to inject.
 */

@Component
public class Driver {

    @Autowired
    private HondaCar toyotaCar;

    public void startJourney() {
        toyotaCar.drive();
    }
}

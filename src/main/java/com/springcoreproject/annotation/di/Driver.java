package com.springcoreproject.annotation.di;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;

/**
 * @Autowired is used for automatic dependency injection.
 * Match by Type - Spring container looks for a bean of the same type and injects it.
 * Match by Name - If multiple beans of the same type exist, Spring looks for a bean with the same name as the field.
 * Match by @Qualifier - If multiple beans of the same type exist, use @Qualifier to specify which bean to inject.
 *
 * @Inject is similar to @Autowired but is part of Java's standard dependency injection.
 * Match by Type - Like @Autowired, it matches by type.
 * No Match by Name - @Inject does not support matching by name.
 * No @Qualifier support - @Inject does not have a built-in qualifier mechanism.
 *
 * @Resource is another Java standard annotation for dependency injection.
 * Match by Name - It first looks for a bean with the same name as the field.
 * Match by Type - If no matching name is found, it falls back to matching by type.
 * No @Qualifier support - @Resource does not have a built-in qualifier mechanism.
 */

@Component
public class Driver {
    @Resource
    private HondaCar skodaCar ;

    public void startJourney() {
        skodaCar.drive();
    }
}

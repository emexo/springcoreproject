package com.springcore.annotation.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Autowired
 *  Match by type - inject the bean by type
 *  Match by Name - inject the bean by name
 *  Match by Qualifier - inject the bean by qualifier
 */

@Component
public class User {


    @Autowired(required = false)
    private Honda honda;


    public void drive() {
        honda.drive();
    }
}

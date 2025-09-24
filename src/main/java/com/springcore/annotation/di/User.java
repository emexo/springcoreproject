package com.springcore.annotation.di;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * Autowired
 *  Match by type - inject the bean by type
 *  Match by Name - inject the bean by name
 *  Match by Qualifier - inject the bean by qualifier
 *
 *  Inject
 *   Match by type - inject the bean by type
 *   Match by Name - inject the bean by name
 *   Match by Qualifier - inject the bean by qualifier
 *
 *   Resource
 *    match by Name - inject the bean by name
 *    match by type - inject the bean by type
 *    match by Qualifier - inject the bean by qualifier
 */

@Component
public class User {


    @Resource
    private Honda honda;


    public void drive() {
        honda.drive();
    }
}

package com.springcore.annotation.di;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.inject.Inject;


/**
 * Autowired
 *  Match by Type - inject the bean by Type
 *  Match by Name - inject the bean by Name
 *  If there are multiple beans of the same type, use
 *  Qualifier
 *  primay - to give preference to one bean over the other
 */
@Component
public class Driver {


    @Inject
    private Toyota toyota;

    public void drive() {
        toyota.drive();
    }

}

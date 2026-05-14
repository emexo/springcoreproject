package com.springcore.annotaion.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Autowired
 *  match by type
 *  match by qualifier
 *  match by name
 */

@Component
public class Driver {
    //@Qualifier("skoda")
    @Autowired
    private Toyota skoda;

    public void drive(){
        skoda.engine();
    }
}

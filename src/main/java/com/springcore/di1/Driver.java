package com.springcore.di1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Driver {

    @Autowired
    private Vehicle honda;


    public void drive() {
        honda.engine();
    }
}

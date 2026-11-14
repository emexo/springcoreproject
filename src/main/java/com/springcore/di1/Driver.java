package com.springcore.di1;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;




@Component
public class Driver {


    @Autowired
    private Toyota honda;

    public void print(){
        honda.engine();
    }
}

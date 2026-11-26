package com.springcore.di1;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.inject.Inject;


@Component
public class Driver {


    @Resource
    private Toyota honda;

    public Driver(Toyota honda) {
        this.honda = honda;
    }

    public void print(){
        honda.engine();
    }
}

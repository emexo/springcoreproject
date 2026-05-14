package com.springcore.annotaion.di;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class Skoda implements Vehicle{

    @Override
    public void engine() {
        log.info("##### Skoda Engine ####");
    }
}

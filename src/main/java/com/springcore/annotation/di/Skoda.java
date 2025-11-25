package com.springcore.annotation.di;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
@Log4j2
public class Skoda implements Vehicle{
    @Override
    public void drive() {
        log.info("Driving Skoda Car");
    }
}

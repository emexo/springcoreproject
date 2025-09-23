package com.springcore.annotation.di;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class Honda implements Vehicle{
    @Override
    public void drive() {
        log.info ("Driving Honda car");
    }
}

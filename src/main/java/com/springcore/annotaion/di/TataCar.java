package com.springcore.annotaion.di;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class TataCar implements Vehicle{
    @Override
    public void drive() {
        log.info("Tata Car is driving...");
    }
}

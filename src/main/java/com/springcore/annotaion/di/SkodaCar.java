package com.springcore.annotaion.di;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Log4j2
public class SkodaCar implements Vehicle{
    @Override
    public void drive() {
        log.info("Skoda Car is driving...");
    }
}

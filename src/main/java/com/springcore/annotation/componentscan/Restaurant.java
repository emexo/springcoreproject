package com.springcore.annotation.componentscan;

import org.springframework.stereotype.Component;
import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class Restaurant {
    public void greet() {
        log.info("Welcome to our Restaurant!");
    }
}

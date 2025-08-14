package com.springcore.annotation.componentscan;

import org.springframework.stereotype.Component;
import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class Menu {
    public void displayMenu() {
        log.info("Today's Special: Spring Rolls!");
    }
}

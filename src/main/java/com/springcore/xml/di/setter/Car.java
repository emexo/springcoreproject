package com.springcore.xml.di.setter;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Setter
public class Car {
    private String brand;
    private String model;
    private int year;
    private Engine engine;

   public void getCarDetails() {
        log.info("Car Brand: {}", brand);
        log.info("Car Model: {}", model);
        log.info("Car Year: {}", year);
        if (engine != null) {
            engine.getEngineDetails();
        } else {
            log.warn("No engine details available.");
        }
    }
}

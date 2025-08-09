package com.springcore.xml.di.setter;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Setter
public class Engine {
    private String type;
    private int horsePower;
    private String fuelType;

    public void getEngineDetails() {
        log.info("Engine Type: {}", type);
        log.info("Horsepower: {}", horsePower);
        log.info("Fuel Type: {}", fuelType);
    }

}

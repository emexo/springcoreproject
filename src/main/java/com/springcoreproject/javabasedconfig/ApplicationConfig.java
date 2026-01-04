package com.springcoreproject.javabasedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class ApplicationConfig {

    @Bean(name = "date")
    public Date getCurrentDate() {
        return new Date();
    }
}

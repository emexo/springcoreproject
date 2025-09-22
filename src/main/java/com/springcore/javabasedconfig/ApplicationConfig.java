package com.springcore.javabasedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class ApplicationConfig {

    @Bean(name = "dateBean")
    public Date getDate() {
        return new Date();
    }
}

package com.springcore.javabasedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;
import java.util.Date;


@Configuration
public class ApplicationConfig
{

    @Bean(value = "dateBean")
    public Date getDate() {
        return new Date();
    }

    @Bean
    public Calendar getCalendar() {
        return Calendar.getInstance();
    }
}

package com.springcore.annotaion.propertyfile;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@PropertySource("classpath:application.properties")
public class DbConfiguration {
    @Value("${db.url}")
    private String url;

    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;


    public void displayConfig() {
        log.info("DB URL: " + url);
        log.info("DB Username: " + username);
        log.info("DB Password: " + password);
    }
}

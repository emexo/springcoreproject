package com.springcore.annotation.propertyfile;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Log4j2
@PropertySource("application.properties")
public class DBConnection {
    @Value("${db.url}")
    private String url;

    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;


    public void getConnection() {
        log.info("Connecting to database with URL: {}", url);
        log.info("Using username: {}", username);
        // Note: In a real application, you should not log the password for security reasons.
        log.info("Using password: {}", password);
    }
}

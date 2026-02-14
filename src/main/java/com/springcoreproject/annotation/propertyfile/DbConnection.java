package com.springcoreproject.annotation.propertyfile;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Log4j2
@PropertySource("application.properties") // Load properties from application.properties file
/*@PropertySources({@PropertySource("classpath:additional.properties"),
@PropertySource("")})*/ // Load properties from additional.properties file
@Component
public class DbConnection {

    @Value("${datasource.url}") // Inject value of datasource.url property
    private String url;

    @Value("${datasource.username}") // Inject value of datasource.username property
    private String username;

    @Value("${datasource.password}") // Inject value of datasource.password property
    private String password;

    public void getDbConnectionDetails() {
        log.info("Database Connection Details:");
        log.info("URL: " + url);
        log.info("Username: " + username);
        log.info("Password: " + password);
    }
}

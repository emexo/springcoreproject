package com.springcore.annotaion.propertyfile;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("application.properties")
@Log4j2
@Component
public class PropertyFile {
    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;

    @Value("${db.url}")
    private String url;

    public void getDbConnection(){
        log.info("Username:{}, password:{} and url:{}", username, password, url);
    }

}

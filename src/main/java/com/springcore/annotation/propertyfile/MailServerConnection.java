package com.springcore.annotation.propertyfile;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@PropertySource("application.properties")
/*@PropertySources({
        @PropertySource("classpath:db.properties"),
        @PropertySource("classpath:api.properties")
})*/
public class MailServerConnection {
    @Value("${mail.server}")
    private String host;

    @Value("${mail.port}")
    private int port;

    @Value("${mail.username}")
    private String username;

    @Value("${mail.password}")
    private String password;

    public void getConnectionDetails() {
        log.info("Mail Server Details:");
        log.info("Host: {}" , host);
        log.info("Port: {}" , port);
        log.info("Username: {}" , username);
        log.info("Password:{}", password);
    }
}

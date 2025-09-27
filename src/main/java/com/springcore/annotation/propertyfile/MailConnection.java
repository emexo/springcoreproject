package com.springcore.annotation.propertyfile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component
@PropertySource("application.properties")

public class MailConnection {

    @Value("${mail.host}")  // Inject value from properties file
    private String host;

    public void getMailDetails() {
        System.out.println("Mail Host: " + host);
    }

}

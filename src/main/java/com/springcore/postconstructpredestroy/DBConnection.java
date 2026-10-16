package com.springcore.postconstructpredestroy;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component("connection")
public class DBConnection {
    @PostConstruct
    public void connect() {
        System.out.println("DB Connection established");
    }
    @PreDestroy
    public void disconnect() {
        System.out.println("DB Connection closed");
    }
}

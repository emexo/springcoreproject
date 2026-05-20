package com.springcore.annotaion.postconstructpredestroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class DBConnection {
    @PostConstruct
    public void createConnection(){
       log.info("####Create connection#####");
    }

    @PreDestroy
    public void closeConnection(){
        log.info("Close connection");
    }
}

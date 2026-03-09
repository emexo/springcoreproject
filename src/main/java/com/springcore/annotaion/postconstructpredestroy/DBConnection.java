package com.springcore.annotaion.postconstructpredestroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class DBConnection {

    @PostConstruct // This method will be called after the bean is initialized
    public void getConnection(){
        log.info("Getting connection from DB");
    }

    @PreDestroy // This method will be called before the bean is destroyed
     public void closeConnection(){
        log.info("Closing connection from DB");
    }
}

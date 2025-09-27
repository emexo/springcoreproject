package com.springcore.annotation.postconstructpredestroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Log4j2
@Repository
public class UserDAO {

    @PostConstruct
    public void getConnection(){
        log.info("Database connection established");
    }

    @PreDestroy
    public void closeConnection(){
        log.info("Database connection closed");
    }
}

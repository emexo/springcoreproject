package com.springcore.annotaion.bean;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Log4j2
@Repository
public class UserRepository {

    public UserRepository(){
        log.info("***** Default Constructor *****");
    }


    public void print(){
        log.info("####### User Repo #######");
    }

}

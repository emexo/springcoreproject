package com.springcoreproject.dao;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
@Log4j2
@Component
public class TransactionDAO {

    public void saveTransaction() {
        log.info("Transaction saved to the database.");
    }
}

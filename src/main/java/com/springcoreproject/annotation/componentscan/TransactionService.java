package com.springcoreproject.annotation.componentscan;

import com.springcoreproject.dao.TransactionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@ComponentScan("com.springcoreproject.dao")
@Service
public class TransactionService {

    @Autowired
    private TransactionDAO transactionDAO;

    public void getTransactionDetails() {
        transactionDAO.saveTransaction();
    }
}

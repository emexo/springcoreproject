package com.springcore.annotaion.bean;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentService {
    public PaymentService(){
        log.info("#### Default Constructor ####");
    }

    public void getPayment(){
        log.info("Payment Service");
    }
}

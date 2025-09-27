package com.springcore.payment;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class Payment {
    public void makePayment() {
        log.info("Payment made successfully!");
    }
}

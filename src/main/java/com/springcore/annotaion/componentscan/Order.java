package com.springcore.annotaion.componentscan;

import componentscan.Payment;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan("componentscan")
@Component
@Log4j2
public class Order {
    @Autowired
    private Payment payment;

    public void placeOrder() {
        log.info("Placing order...");
        payment.processPayment();
    }
}

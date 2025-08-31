package com.springcore.annotation.componentscan;

import com.springcore.transaction.Payment;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Log4j2
@ComponentScan("com.springcore.transaction")
@Component
public class Order {

    @Autowired
    private Payment payment;

    public void placeOrder() {
        payment.makePayment();
        log.info("Order placed successfully.");
    }
}

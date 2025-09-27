package com.springcore.annotation.componentscan;

import com.springcore.payment.Payment;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan("com.springcore.payment")
@Log4j2
@Component
public class Order {

    @Autowired
    private Payment payment;

    public void placeOrder() {
        log.info("Order placed successfully!");
        payment.makePayment();
    }
}

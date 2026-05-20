package com.springcore.annotaion.compoentscan;

import com.payment.Payment;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@ComponentScan("com.payment")
public class Order {
    @Autowired
    private Payment payment;

    public void getPayment(){
        log.info("order details");
        payment.getPayment();
    }
}

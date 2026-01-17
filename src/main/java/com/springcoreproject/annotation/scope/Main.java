package com.springcoreproject.annotation.scope;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Log4j2
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcoreproject.annotation.scope");
        KafkaConnection kafkaConnection1 = context.getBean("kafkaConnection", KafkaConnection.class);
        log.info(kafkaConnection1.hashCode());

        KafkaConnection kafkaConnection2 = context.getBean("kafkaConnection", KafkaConnection.class);
        log.info(kafkaConnection2.hashCode());

    }
}

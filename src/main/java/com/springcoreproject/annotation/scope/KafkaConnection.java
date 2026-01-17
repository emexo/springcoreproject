package com.springcoreproject.annotation.scope;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Log4j2
@Scope("prototype")
@Component
public class KafkaConnection {

    public KafkaConnection(){
        log.info("#####KafkaConnection object created@#####");
    }

    public void getConnectionDetails() {
        log.info("Kafka Connection: Bootstrap Servers - localhost:9092, Topic - my-topic");
    }
}

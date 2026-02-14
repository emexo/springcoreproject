package com.springcoreproject.annotation.scope;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Bean Scope in Spring:
 * 1. Singleton (Default): A single instance per Spring IoC container.
 * 2. Prototype: A new instance each time the bean is requested.
 * 3. Request: A single instance per HTTP request (web applications).
 * 4. Session: A single instance per HTTP session (web applications).
 * 5. Global Session: A single instance per global HTTP session (portlet-based web applications).
 * 6. Application: A single instance per ServletContext (web applications).
 * 7. WebSocket: A single instance per WebSocket session.
 */
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

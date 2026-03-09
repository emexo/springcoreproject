package com.springcore.annotaion.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 1. @Scope: This annotation is used to specify the scope of a bean in Spring. It defines how many instances of the bean will be created and how they will be shared within the application context. The most common scopes are:
 *    - singleton: This is the default scope. Only one instance of the bean will be created, and it will be shared across the entire application context.
 *    - prototype: A new instance of the bean will be created each time it is requested
 *
 *    - request: A new instance of the bean will be created for each HTTP request (used in web applications).
 *    - session: A new instance of the bean will be created for each HTTP session (used in web applications).
 *    - application: A single instance of the bean will be created for the entire web application (used in web applications).
 *    - websocket: A new instance of the bean will be created for each WebSocket connection (used in web applications).
 *
 */

@Scope("request") // This bean will be created for each HTTP request (used in web applications)
@Component
public class Employee {
        private String name;
        private int id;

        public Employee() {
            System.out.println("Employee constructor called");
            this.name = "John Doe";
            this.id = 1;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
}

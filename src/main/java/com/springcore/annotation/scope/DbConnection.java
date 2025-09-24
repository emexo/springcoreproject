package com.springcore.annotation.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class DbConnection {
    private static int count = 0;
    private int id;

    public DbConnection() {
        count++;
        id = count;
        System.out.println("DbConnection instance created with id: " + id);
    }

    public int getId() {
        return id;
    }
}

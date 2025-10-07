package com.springcore.aop.model;

import lombok.Getter;
import lombok.ToString;


@ToString
@Getter
public class Passenger {
    private int id;

    public Passenger(int id) {
        this.id = id;
    }
}

package com.springcore.dao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class User {
    private int id;
    private String username;
    private String password;
    private String fullName;
    private String email;
}

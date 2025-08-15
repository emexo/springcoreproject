package com.springcore.dao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class User {
    private int id;
    private String username;
    private String password;
    private String fullname;
    private String email;
}

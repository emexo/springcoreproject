package com.springcore.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(User user) {
        String query = "insert into users(id, username, password, fullname, email) values(nextval('users_id_seq'),?,?, ?,?)";
    }
}

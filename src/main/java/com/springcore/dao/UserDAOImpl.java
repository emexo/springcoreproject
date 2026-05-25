package com.springcore.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    public int saveUser(User user){
        String sql = "insert into public.users(id, username, password, fullname, email) values (nextval('users_id_seq'), ?,?,?,?)";
        int  response = jdbcTemplate.update(sql,user.getUsername(), user.getPassword(), user.getFullName(), user.getEmail());
        return response;
    }
}

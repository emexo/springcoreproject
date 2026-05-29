package com.springcore.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public class UserDAOImpl {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Transactional
    public int saveUser(User user){
        String sql = "insert into public.users(id, username, password, fullname, email) values (nextval('users_id_seq'), ?,?,?,?)";
        int  response = jdbcTemplate.update(sql,user.getUsername(), user.getPassword(), user.getFullName(), user.getEmail());
        return response;
    }

    public List<User> getAll(){
        String sql = "select * from public.users";
       return jdbcTemplate.query(sql, new UserMapper());
    }

    public User getUserByName(String username){
        String sql = "select * from public.users where username=?";
        return jdbcTemplate.queryForObject(sql, new UserMapper(), username);
    }
}

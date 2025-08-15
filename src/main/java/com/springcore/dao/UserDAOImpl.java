package com.springcore.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int saveUser(User user) {
        String sql = "INSERT INTO users (id, username, password, fullname, email) VALUES (nextval('users_id_seq'), ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), user.getFullname(), user.getEmail());
    }

    public List<User> getAllUsers(){
        String sql = "select * from users";
       return  jdbcTemplate.query(sql , new UserRowMapper());
    }

    public User getUserById(int id) {
        String sql = "SELECT * FROM users WHERE id = ?";
       return (User) jdbcTemplate.queryForObject(sql, new UserRowMapper(), id);
    }
}

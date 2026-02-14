package com.springcoreproject.dao;


import lombok.extern.log4j.Log4j2;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Log4j2
@Repository
public class UserDAOImpl implements UserDAO{

    private JdbcTemplate jdbcTemplate;

    public UserDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int save(User user) {
        log.info("Saving user: {}", user);

        String sql = "INSERT INTO users (username, password) VALUES ( ?, ?)";

        return jdbcTemplate.update(sql, user.getUsername(), user.getPassword());
    }

    @Override
    public List<User> findAll() {
        String sql = "SELECT * FROM users";
        return jdbcTemplate.query(sql, new UserRowMapper());
    }

    @Override
    public User findById(int userId) {
        String sql = "SELECT * FROM users WHERE user_id = ?";
        return jdbcTemplate.queryForObject(sql, new UserRowMapper(), userId);
    }
}

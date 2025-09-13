package com.springcore.dao;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Log4j2
@Repository
public class UserDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(User user){
        String sql = "insert into users(id, username, password, fullname, email) values(nextval('public.users_id_seq'),?,?,?,?)";
        int count = jdbcTemplate.update(sql, user.username(), user.password(), user.fullname(), user.email());
        log.info("Number of records inserted: {}", count);

    }

    public void update(int id, String name){
        String sql = "update users set username=? where id=?";
        int count = jdbcTemplate.update(sql, name, id);
        log.info("Number of records updated: {}", count);
    }

    public void delete(int id){
        String sql = "delete from users where id=?";
        int count = jdbcTemplate.update(sql, id);
        log.info("Number of records deleted:{}", count);
    }

    public List<User> findAll(){
        String sql = "select * from users";
        return jdbcTemplate.query(sql, new UserMapper());
    }

    public User findById(int id){
        String sql = "select * from users where id=?";
        return  jdbcTemplate.queryForObject(sql, new UserMapper(), id);
    }
}

package com.springcoreproject.dao;

import java.util.List;

public interface UserDAO {
    int save(User user);

    List<User> findAll();

    User findById(int userId);
}

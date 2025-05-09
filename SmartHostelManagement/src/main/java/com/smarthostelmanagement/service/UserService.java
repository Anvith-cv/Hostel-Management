package com.smarthostelmanagement.service;

import com.smarthostelmanagement.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    User getUserById(Long id);
    void deleteUser(Long id);
}

package com.luv2code.springboot.cruddemo.services;

import com.luv2code.springboot.cruddemo.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public void deleteUserById(int id);
}

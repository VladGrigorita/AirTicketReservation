package com.luv2code.springboot.cruddemo.services;

import com.luv2code.springboot.cruddemo.entity.User;
import com.luv2code.springboot.cruddemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Base64;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(User user) {
        String userPassword=user.getPassword();
        user.setPassword(new String(Base64.getEncoder().encode(userPassword.getBytes())));
        userRepository.save(user);
    }

    @Override
    public void deleteUserById(int id) {
        userRepository.deleteById(id);
    }


}

package com.luv2code.springboot.cruddemo.controller;

import com.luv2code.springboot.cruddemo.entity.User;
import com.luv2code.springboot.cruddemo.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAll(){
        return userService.getAllUsers();
    }

    @PostMapping
    public String save(@RequestBody User user){
        userService.saveUser(user);
        return "user created";
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteUser(@PathVariable int id){
        userService.deleteUserById(id);
    }

}

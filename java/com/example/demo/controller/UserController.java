package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;

public class UserController {
    @RestController
    @RequestMapping("users")
    public class SimpleBookRestController {
    
    // @GetMapping("/{id}", produces = "application/json")
    public User getUser(@PathVariable int id) {
        return findByLastName(id);
    }

    private User findByLastName(int id) {
        return null;
    }

    
}
}

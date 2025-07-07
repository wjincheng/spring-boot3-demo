package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class FirstService {
    @Autowired
    private User user;

    public String getUserName() {
        return user.getName();
    }
}

package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class FistController {

    private final User user;

    @GetMapping("/hello")
    public String hello() {
        return user.getName();
    }



}

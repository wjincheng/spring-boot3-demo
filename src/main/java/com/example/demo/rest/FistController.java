package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.FirstService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class FistController {

    private final FirstService firstService;

    @GetMapping("/hello")
    public String hello() {
        return firstService.getUserName();
    }

}

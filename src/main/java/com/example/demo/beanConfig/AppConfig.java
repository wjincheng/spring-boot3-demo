package com.example.demo.beanConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.User;

@Configuration
public class AppConfig {
    @Bean
    public User user() {
        User user = new User();
        user.setName("test");
        user.setRole("admin");
        return user;
    }
}

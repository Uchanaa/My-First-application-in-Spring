package com.example.Lecture11.config;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {
    @Bean
    public String appName(){
        return "Lecture11 Spring App";
    }
}

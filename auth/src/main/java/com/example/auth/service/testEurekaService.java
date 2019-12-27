package com.example.auth.service;

import org.springframework.stereotype.Service;

@Service
public class testEurekaService {

    public String sayHello(String name) {
        return "hello, "+ name;
    }
}

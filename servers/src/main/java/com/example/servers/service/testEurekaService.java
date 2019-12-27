package com.example.servers.service;

import com.example.servers.client.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class testEurekaService {
    @Autowired
    private Hello hello;
    public String sayHello(String name) {
        return hello.sayHello(name);
    }
}

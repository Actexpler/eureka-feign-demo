package com.example.auth.controller;

import com.example.auth.service.testEurekaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/auth")
public class testEurekaController {

    @Autowired
    private testEurekaService service;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(@RequestParam("name")String name) throws InterruptedException {
        System.out.println("[main-2]:"+name);
//        Thread.sleep(2000);
        System.out.println("I am ok!");
        return service.sayHello(name);
    }
}

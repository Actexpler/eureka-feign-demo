package com.example.servers.controller;

import com.example.servers.service.testEurekaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class testEurekaController {
    @Autowired
    private testEurekaService service;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(@RequestParam("name")String name) {
        String result = service.sayHello(name);
        for( int i = 0; i < 10; i++ ) {
            System.out.println(i);
        }
        return result;
    }

    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    public String sayHello2(@RequestParam("name")String name) {
        System.out.println(name);
        return "[main-1] hello " + name;
    }
}

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
    public String sayHello(@RequestParam("name")String name) {
        return service.sayHello(name);
    }
}

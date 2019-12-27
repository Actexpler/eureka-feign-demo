package com.example.servers.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;


@FeignClient("auth")
public interface Hello {
    @RequestMapping(value = "/auth/hello", method = RequestMethod.GET)
    String sayHello(@RequestParam("name")String name);
}

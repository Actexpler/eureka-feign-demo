package com.example.servers.client;

import com.example.servers.fallback.HelloRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;


@FeignClient(name = "auth", fallback = HelloRemoteHystrix.class)
public interface Hello {
    @RequestMapping(value = "/auth/hello", method = RequestMethod.GET)
    String sayHello(@RequestParam("name")String name);
}

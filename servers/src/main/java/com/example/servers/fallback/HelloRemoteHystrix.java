package com.example.servers.fallback;

import com.example.servers.client.Hello;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteHystrix implements Hello {
    @Override
    public String sayHello(@RequestParam("name")String name) {
        return "hello " + name + ", this message send failed";
    }
}

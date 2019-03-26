package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {
    @Value("${server.port}")
    String port;
    @Value("${spring.application.name}")
    String name;
    @RequestMapping(value = "/mo")
    public String getPort(){
        return "me"+port+name;
    }
}

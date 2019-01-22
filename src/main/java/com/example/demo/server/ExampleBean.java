package com.example.demo.server;

import org.springframework.stereotype.Component;

@Component
public class ExampleBean {

    public String method(){
        return "hello from injected method!";
    }
}

package com.example.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("hello")
    public String SayHello(){
        return "Hello form BridgeLabz";
    }
}

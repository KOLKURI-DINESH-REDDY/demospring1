package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("hii")
    public String hii(){
        return "hey how are you";
    }
    @GetMapping("hello")
    public String hello()
    {
        return "hello";
    }
    @GetMapping("who")
    public String who()
    {
        return "who";
    }
}

package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController
{
    @GetMapping("/msg")
    public String getmsg()
    {
        return "HELLO DOCKER ";
    }
}

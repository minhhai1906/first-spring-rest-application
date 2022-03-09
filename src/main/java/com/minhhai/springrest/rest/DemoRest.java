package com.minhhai.springrest.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoRest {
    @GetMapping("/home")
    public String showHome(){
        return "Take a rest";
    }
}

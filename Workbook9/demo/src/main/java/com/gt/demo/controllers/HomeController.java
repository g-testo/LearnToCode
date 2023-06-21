package com.gt.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index(@RequestParam(defaultValue = "Cat") String name){
        return "Hello Kitty " + name;
    }

}

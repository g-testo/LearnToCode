package com.gt.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cats")
public class CatController {
    @GetMapping
    public String getAllCats() {
        return "All the kitty cats!";
    }
}

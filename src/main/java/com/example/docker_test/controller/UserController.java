package com.example.docker_test.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/{name}")
    public String getName(@PathVariable (name = "name")String name){
        return "Welcome "+name;
    }
}

package com.example.Simplewebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to Simplewebapp!";
    }

    @RequestMapping("/about")
    public String about(){
        return "We dont teach,we educate";
    }
}
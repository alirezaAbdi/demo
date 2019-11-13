package com.au.dektech.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @RequestMapping("/hello/{name}")
    String hello(@PathVariable String name) {

        return String.format("Howdy, %s!", name);
    }
}

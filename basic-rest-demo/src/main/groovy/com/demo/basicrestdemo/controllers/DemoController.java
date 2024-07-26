package com.demo.basicrestdemo.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {


    @GetMapping(value = "/{firstName}")
    public String hello(
            @PathVariable("firstName") String firstName,
            @RequestParam("lastName") String lastName){
        return String.format("{\"message\":\"Hello %s %s\"}",
        firstName, lastName);

    }
}

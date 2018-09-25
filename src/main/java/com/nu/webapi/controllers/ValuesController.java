package com.nu.webapi.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ValuesController {
    @RequestMapping("/api/values")
    public String get() {
        return "hello";
    } 
}
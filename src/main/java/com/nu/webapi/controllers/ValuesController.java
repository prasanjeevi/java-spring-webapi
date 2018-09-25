package com.nu.webapi.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.*;

@RestController
public class ValuesController {
    @RequestMapping("/api/values")
    public List<String> get() {
        return  Arrays.asList("hello","world");
    }

    @RequestMapping("/api/values/{id}")
    public String get(@PathVariable int id) {
        return "hello";
    }

    @PostMapping("/api/values/")
    public void post(@RequestBody String value) {
    }

    @PutMapping("/api/values/{id}")
    public void put(@PathVariable int id, @RequestBody String value) {
    }

    @DeleteMapping("/api/values/{id}")
    public void del(@PathVariable int id, @RequestBody String value) {
    }
}
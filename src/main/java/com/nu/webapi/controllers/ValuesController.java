package com.nu.webapi.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
import java.util.stream.Collectors;

@RestController
public class ValuesController {

    static List<String> values = new ArrayList<String>();
    
    @GetMapping("/api/values")
    public List<String> get(@RequestParam(required=false) String q) {
        if(q != null && !q.isEmpty()) {
            return values.stream()
                    .filter(value -> value.toLowerCase().contains(q.toLowerCase()))
                    .collect(Collectors.toList());
        }
        return values;
    }

    @GetMapping("/api/values/{id}")
    public String get(@PathVariable int id) {
        return values.get(id);
    }

    @PostMapping("/api/values/")
    public void post(@RequestBody String value) {
        values.add(value);
    }

    @PutMapping("/api/values/{id}")
    public void put(@PathVariable int id, @RequestBody String value) {
        values.set(id, value);
    }

    @PatchMapping("/api/values/{id}")
    public void patch(@PathVariable int id, @RequestBody String value) {
        values.set(id, value);
    }

    @DeleteMapping("/api/values/{id}")
    public void del(@PathVariable int id) {
        values.remove(id);
    }
}
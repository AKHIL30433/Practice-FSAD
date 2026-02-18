package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klu.service.Calciservice;

@RestController
@RequestMapping("/calculator")
public class CalcController {

    @Autowired
    private Calciservice service;

    // Addition
    // URL: http://localhost:8080/calculator/add?a=5&b=6
    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return service.add(a, b);
    }

    // Subtraction
    // URL: http://localhost:8080/calculator/sub/5/6
    @GetMapping("/sub/{a}/{b}")
    public int sub(@PathVariable int a, @PathVariable int b) {
        return service.sub(a, b);
    }

    // Multiplication
    @GetMapping("/mul/{a}/{b}")
    public int mul(@PathVariable int a, @PathVariable int b) {
        return service.mul(a, b);
    }

    // Modulus
    @GetMapping("/mod/{a}/{b}")
    public int mod(@PathVariable int a, @PathVariable int b) {
        return service.mod(a, b);
    }

    // Division
    // URL: http://localhost:8080/calculator/div?a=10&b=2
    @GetMapping("/div")
    public double div(@RequestParam int a, @RequestParam int b) {
        return service.div(a, b);
    }
}

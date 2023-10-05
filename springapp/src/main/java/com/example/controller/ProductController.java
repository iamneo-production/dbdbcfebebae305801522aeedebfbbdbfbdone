package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController{

    @GetMapping("/products/{id}")
    @ResponseStatus(code = HttpStatus.OK, reason = "OK")
    public 
}
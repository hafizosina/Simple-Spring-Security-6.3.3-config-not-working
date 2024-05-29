package com.example.demo.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {


    @PostMapping("/test")
    public ResponseEntity<String> login(HttpServletRequest servletRequest) {
        return ResponseEntity.ok("halo");
    }
}

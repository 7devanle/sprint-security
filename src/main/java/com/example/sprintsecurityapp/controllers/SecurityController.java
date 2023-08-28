package com.example.sprintsecurityapp.controllers;

import com.example.sprintsecurityapp.entity.Nodes;
import com.example.sprintsecurityapp.services.SecureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
    @Autowired
    private SecureService secureService;

    @GetMapping("/secures")
    public Iterable<Nodes> getAllNodes(){
        return secureService.getAllSecurity();
    }
    @GetMapping("/hello")
    public String greet(){
        return "Hello to Spring Security";
    }
}

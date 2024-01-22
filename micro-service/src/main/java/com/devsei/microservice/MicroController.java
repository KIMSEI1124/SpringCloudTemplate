package com.devsei.microservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/micro-service")
public class MicroController {

    @Value("${hello}")
    private String hello;

    @GetMapping("/get")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("get() ---> " + hello);
    }
}

package com.devsei.microservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/micro-service")
@Slf4j
public class MicroController {

    @Value("${hello}")
    private String hello;

    @GetMapping("/get")
    public ResponseEntity<String> get() {
        log.info("get() -----> run");
        return ResponseEntity.ok("get() ---> " + hello);
    }
}

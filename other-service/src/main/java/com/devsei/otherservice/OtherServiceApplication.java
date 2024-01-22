package com.devsei.otherservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OtherServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OtherServiceApplication.class, args);
    }

}

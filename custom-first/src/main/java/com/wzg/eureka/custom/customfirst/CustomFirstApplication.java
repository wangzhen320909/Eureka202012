package com.wzg.eureka.custom.customfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomFirstApplication.class, args);
    }

}

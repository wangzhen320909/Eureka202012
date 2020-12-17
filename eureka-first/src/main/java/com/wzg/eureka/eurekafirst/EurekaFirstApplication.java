package com.wzg.eureka.eurekafirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFirstApplication.class, args);
    }

}
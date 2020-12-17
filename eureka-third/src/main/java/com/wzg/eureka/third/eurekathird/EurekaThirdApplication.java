package com.wzg.eureka.third.eurekathird;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaThirdApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaThirdApplication.class, args);
    }

}

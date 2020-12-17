package com.wzg.eureka.second.eurekasecond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaSecondApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSecondApplication.class, args);
    }

}

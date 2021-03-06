package com.mjz.yll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer//创建项目加上
@SpringBootApplication
public class SpringcloudsercliApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudsercliApplication.class, args);
    }
}

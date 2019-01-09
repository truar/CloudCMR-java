package com.cloudcmr.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CloudCmrApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(CloudCmrApp.class)
                .properties("spring.config.name:application,datasource")
                .build().run(args);
    }
}


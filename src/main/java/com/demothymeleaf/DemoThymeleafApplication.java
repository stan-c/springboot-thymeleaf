package com.demothymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DemoThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoThymeleafApplication.class, args);
    }
}

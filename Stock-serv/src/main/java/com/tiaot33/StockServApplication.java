package com.tiaot33;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StockServApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockServApplication.class, args);
    }

}

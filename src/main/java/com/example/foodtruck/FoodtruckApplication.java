package com.example.foodtruck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Food truck app
 * Author: Hemang Gandhi
 */
@SpringBootApplication(scanBasePackages={"com.example.foodtruck"})
public class FoodtruckApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoodtruckApplication.class, args);
    }

    @Bean
    public RestTemplate rest() {
        return new RestTemplate();
    }

}

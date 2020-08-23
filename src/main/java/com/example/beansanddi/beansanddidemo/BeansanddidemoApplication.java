package com.example.beansanddi.beansanddidemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BeansanddidemoApplication {

    @Autowired
    RestTemplate restTemplate;
    public static void main(String[] args) {

        SpringApplication.run(BeansanddidemoApplication.class, args);
    }

    @Bean
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}

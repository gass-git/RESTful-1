package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @SpringBootApplication annotation:
 * is used to mark a configuration class that declares one
 * or more @Bean methods and also triggers auto-configuration 
 * and component scanning.
 */
@SpringBootApplication
public class RestServiceApp {
    
    public static void main(String[] args){
        SpringApplication.run(RestServiceApp.class, args);
    }
}
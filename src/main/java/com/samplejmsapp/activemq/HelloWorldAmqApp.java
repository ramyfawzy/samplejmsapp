package com.samplejmsapp.activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
 
@SpringBootApplication
@ImportResource("classpath*:/springintegration-config.xml")
public class HelloWorldAmqApp {
 
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldAmqApp.class, args);
    }
}

package com.example.xmlconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.xmlconsumer", "kafka.model"})
public class XmlConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(XmlConsumerApplication.class, args);
    }

}

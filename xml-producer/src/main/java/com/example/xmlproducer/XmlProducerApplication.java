package com.example.xmlproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.xmlproducer", "kafka.model"})
public class XmlProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(XmlProducerApplication.class, args);
    }

}

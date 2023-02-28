package com.example.xmlproducer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfiguration {

    @Bean
    public NewTopic createXmlTopic() {
        return TopicBuilder
                .name("xml-topic")
                .partitions(1)
                .build();
    }
}



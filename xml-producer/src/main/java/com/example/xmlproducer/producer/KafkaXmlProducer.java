package com.example.xmlproducer.producer;

import lombok.RequiredArgsConstructor;
import kafka.model.FileInfo;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaXmlProducer {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void productProducer(FileInfo fileInfo) {
        kafkaTemplate.send("xml-topic", 0, "key-1", fileInfo);
    }
}

package com.example.xmlconsumer.consumer;

import com.example.xmlconsumer.service.ProductService;
import kafka.model.FileInfo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class ProductConsumer {

    private final ProductService productService;

    @KafkaListener(groupId = "kafka-group-id",
            topicPartitions = {@TopicPartition(topic = "xml-topic",
                    partitionOffsets = @PartitionOffset(partition = "0",
                            initialOffset = "0",
                            relativeToCurrent = "true"))}
    )
    public void xmlListener(FileInfo fileInfo) {
        productService.productXmlReader(fileInfo);
    }


}

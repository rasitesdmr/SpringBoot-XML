package com.example.xmlproducer.service;

import com.example.xmlproducer.producer.KafkaXmlProducer;
import lombok.RequiredArgsConstructor;
import kafka.model.FileInfo;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class XmlServiceImpl implements XmlService {

    private final KafkaXmlProducer productProducer;

    @Override
    public void processXml(MultipartFile multipartFile) throws IOException {

        FileInfo fileInfo = new FileInfo();
        fileInfo.setName(multipartFile.getName());
        fileInfo.setType(multipartFile.getContentType());
        fileInfo.setSize(multipartFile.getSize());
        fileInfo.setData(multipartFile.getBytes());

        productProducer.productProducer(fileInfo);
    }

}

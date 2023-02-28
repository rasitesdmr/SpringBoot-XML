package com.example.xmlproducer.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface XmlService {

    void processXml(MultipartFile multipartFile) throws IOException;
}

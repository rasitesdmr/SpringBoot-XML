package com.example.xmlproducer.controller;

import com.example.xmlproducer.service.XmlService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/xml")
@RequiredArgsConstructor
public class XmlController {

    private final XmlService xmlService;


    @PostMapping(path = "/sendXmlFile", consumes = {"multipart/form-data"})
    public void sendXmlFile(@RequestPart("/multipartFile") MultipartFile multipartFile) throws IOException {
        xmlService.processXml(multipartFile);
    }
}

package com.example.xmlconsumer.service;

import kafka.model.FileInfo;
import kafka.model.Product;

import java.util.List;

public interface ProductService {

    void productXmlReader(FileInfo fileInfo);



}

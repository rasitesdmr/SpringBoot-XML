package com.example.xmlconsumer.service;

import com.example.xmlconsumer.repository.ProductRepository;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import kafka.model.FileInfo;
import kafka.model.Product;
import kafka.model.ProductProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;


@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final XmlMapper xmlMapper;

    private final ProductRepository productRepository;


    @Override
    public void productXmlReader(FileInfo fileInfo) {

        byte[] data = fileInfo.getData();
        try {

            ProductProperties productProperties = xmlMapper.readValue(data, ProductProperties.class);
            createProduct(productProperties);


        } catch (IOException exception) {
            log.error(exception.getMessage());
        }
    }


    public void createProduct(ProductProperties productProperties) {

        Product product = new Product();
        product.setName(productProperties.getProduct().getName());
        product.setPrice(productProperties.getProduct().getPrice());
        product.setIslemciTipi(productProperties.getProduct().getIslemciTipi());
        product.setSsdKapasitesi(productProperties.getProduct().getSsdKapasitesi());
        product.setCozunurluk(productProperties.getProduct().getCozunurluk());
        product.setEkranKarti(productProperties.getProduct().getEkranKarti());
        product.setEkranKartiTipi(productProperties.getProduct().getEkranKartiTipi());
        product.setIslemciModeli(productProperties.getProduct().getIslemciModeli());
        product.setIslemciNesli(productProperties.getProduct().getIslemciNesli());
        product.setDokunmatikEkran(productProperties.getProduct().getDokunmatikEkran());
        product.setCozunurlukStandarti(productProperties.getProduct().getCozunurlukStandarti());
        product.setGarantiTipi(productProperties.getProduct().getGarantiTipi());
        product.setBaglantilar(productProperties.getProduct().getBaglantilar());
        product.setRenk(productProperties.getProduct().getRenk());
        product.setRam(productProperties.getProduct().getRam());
        product.setIsletimSistemi(productProperties.getProduct().getIsletimSistemi());
        product.setEkranYenilemeHizi(productProperties.getProduct().getEkranYenilemeHizi());
        product.setEkranBoyutu(productProperties.getProduct().getEkranBoyutu());
        product.setCihazAgirligi(productProperties.getProduct().getCihazAgirligi());
        product.setEkranKartiHafizasi(productProperties.getProduct().getEkranKartiHafizasi());
        product.setIslemcicekirdekSayisi(productProperties.getProduct().getIslemcicekirdekSayisi());
        product.setGarantiSuresi(productProperties.getProduct().getGarantiSuresi());

        productRepository.save(product);

    }
}

package com.demo.oauthapi.service.impl;

import com.demo.oauthapi.domain.entity.ProductEntity;
import com.demo.oauthapi.domain.repository.ProductRepository;
import com.demo.oauthapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Iterable<ProductEntity> getProducts(){
        return productRepository.findAll();
    }

    public ProductEntity createProduct(ProductEntity productEntity){
        return productRepository.save(productEntity);
    }
}

package com.demo.oauthapi.rest.controller;

import com.demo.oauthapi.domain.entity.ProductEntity;
import com.demo.oauthapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    private Iterable<ProductEntity> getProducts(){
        return productService.getProducts();
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ProductEntity createProduct(@RequestBody ProductEntity productEntity){
        return productService.createProduct(productEntity);
    }

}

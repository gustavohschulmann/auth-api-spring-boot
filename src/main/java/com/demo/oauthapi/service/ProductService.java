package com.demo.oauthapi.service;

import com.demo.oauthapi.domain.entity.ProductEntity;

public interface ProductService {

    Iterable<ProductEntity> getProducts();

    ProductEntity createProduct(ProductEntity productEntity);

}

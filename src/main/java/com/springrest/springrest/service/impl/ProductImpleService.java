package com.springrest.springrest.service.impl;

import com.springrest.springrest.entity.Product;

import java.util.List;

public interface ProductImpleService {
    public List<Product> getAllProducts();
    public Product getProductById(int productId);

}

package com.springrest.springrest.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springrest.springrest.entity.Product;
import com.springrest.springrest.service.impl.ProductImpleService;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class ProductService implements ProductImpleService {
    public List<Product> getAllProducts() {
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Product>> typeReference = new TypeReference<>() {
        };
        InputStream inputStream = TypeReference.class.getResourceAsStream("/product.json");
        try {
            return objectMapper.readValue(inputStream, typeReference);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Product getProductById(int productId) {
        List<Product> products = getAllProducts();
        if (products != null) {
            for (Product product : products) {
                if (product.getId()==productId) {
                    return product;
                }
            }
        }
        return null;
    }
}

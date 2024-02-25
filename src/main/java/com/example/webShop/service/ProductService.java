package com.example.webShop.service;

import com.example.webShop.model.Product;

public interface ProductService {

    Product createProduct(Product product);

    Product getProductById(Long id);
    // Другие методы
}


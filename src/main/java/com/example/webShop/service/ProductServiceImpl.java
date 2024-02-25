package com.example.webShop.service;

import com.example.webShop.model.Product;
import com.example.webShop.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(Product product) {
        // Логика создания продукта
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(Long id) {
        // Логика получения продукта по id
        return productRepository.findById(id).orElse(null);
    }

    // Другие методы, если необходимо
}


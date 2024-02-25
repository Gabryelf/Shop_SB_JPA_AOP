package com.example.shopAOP.services;

import com.example.shopAOP.model.Product;
import com.example.shopAOP.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Класс сервиса связанного с резервированием товара.
 */
@Service
public class ReservationService {

    private final ProductRepository productRepository;

    public ReservationService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public void reserveProduct(Long productId) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        // Здесь должен быть код для резервирования товара
        // ...

        System.out.println("Product reserved: " + product.getName());
    }
}


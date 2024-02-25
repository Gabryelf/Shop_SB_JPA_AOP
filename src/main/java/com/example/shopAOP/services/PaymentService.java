package com.example.shopAOP.services;

import com.example.shopAOP.model.Product;
import com.example.shopAOP.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Класс сервиса связанного с покупкой товара
 */
@Service
public class PaymentService {

    private final ProductRepository productRepository;

    public PaymentService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public void processPayment(Long productId) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        // Здесь должен быть код для обработки оплаты товара
        // ...

        System.out.println("Payment processed for product: " + product.getName());
    }
}


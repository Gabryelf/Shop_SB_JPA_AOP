package com.example.shopAOP.controllers;

import com.example.shopAOP.model.Product;
import com.example.shopAOP.repository.ProductRepository;
import com.example.shopAOP.services.PaymentService;
import com.example.shopAOP.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Класс контроллер использует rest (post-запросы)
 * сначала запускаем initializeDatabase
 * потом резервируем товар reserveProduct(
 * и покупаем processPayment
 */

@RestController
@RequestMapping("/shop")
public class ShopController {

    private final ReservationService reservationService;
    private final PaymentService paymentService;
    private final ProductRepository productRepository;

    @Autowired
    public ShopController(ReservationService reservationService, PaymentService paymentService, ProductRepository productRepository) {
        this.reservationService = reservationService;
        this.paymentService = paymentService;
        this.productRepository = productRepository;
    }

    //резервируем товар(в корзину)
    @PostMapping("/reserve/{productId}")
    public void reserveProduct(@PathVariable Long productId) {
        reservationService.reserveProduct(productId);
    }

    //покупаем товар(из корзины)
    @PostMapping("/pay/{productId}")
    public void processPayment(@PathVariable Long productId) {
        paymentService.processPayment(productId);
    }

    //метод для создания товаров(необходимо сначала его запустить)
    @PostMapping("/init-db")
    public void initializeDatabase() {
        // Добавление нескольких товаров в базу данных при инициализации
        Product product1 = new Product();
        product1.setName("Product 1");
        productRepository.save(product1);

        Product product2 = new Product();
        product2.setName("Product 2");
        productRepository.save(product2);

        System.out.println("Database initialized with products.");
    }
}



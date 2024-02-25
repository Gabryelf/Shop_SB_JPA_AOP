package com.example.shopAOP.repository;

import com.example.shopAOP.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Интерфейс для базы данных на основе JPA
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}

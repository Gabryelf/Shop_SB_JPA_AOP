package com.example.webShop.controller;

import com.example.webShop.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String index(Model model) {
        // Получить список продуктов и передать его в модель
        return "index";
    }

    @GetMapping("/product/{id}")
    public String productDetails(Long id, Model model) {
        // Получить продукт по id и передать его в модель
        return "product";
    }
}


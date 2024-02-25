package com.example.payShop.service;

import com.example.payShop.model.Payment;
import jakarta.transaction.Transactional;

public interface PaymentService {
    @Transactional
    Payment processPayment(Long reservationId, double amount);
    // Другие методы
}


package com.example.payShop.repository;

import com.example.payShop.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    // Найти все платежи для конкретной резервации
    List<Payment> findByReservationId(Long reservationId);

    // Найти все платежи с определенной суммой
    List<Payment> findByAmount(double amount);

}



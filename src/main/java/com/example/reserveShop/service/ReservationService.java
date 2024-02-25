package com.example.reserveShop.service;

import com.example.reserveShop.model.Reservation;
import jakarta.transaction.Transactional;

import java.util.List;

public interface ReservationService {

    @Transactional
    Reservation reserveProduct(Long productId, int quantity);

    List<Reservation> getReservationsByProductId(Long productId);

    @org.springframework.transaction.annotation.Transactional
    void cancelReservation(Long reservationId);
    // Другие методы
}


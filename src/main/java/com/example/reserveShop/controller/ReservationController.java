package com.example.reserveShop.controller;

import com.example.reserveShop.model.Reservation;
import com.example.reserveShop.service.ReservationService;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping
    @Transactional
    public Reservation reserveProduct(
            @RequestParam Long productId,
            @RequestParam int quantity
    )
    {
        // Зарезервировать товар
        return reservationService.reserveProduct(productId, quantity);
    }
}

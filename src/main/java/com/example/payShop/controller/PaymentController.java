package com.example.payShop.controller;

import com.example.payShop.model.Payment;
import com.example.payShop.service.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public Payment processPayment(
            @RequestParam Long reservationId,
            @RequestParam double amount
    ) {
        return paymentService.processPayment(reservationId, amount);
    }
}



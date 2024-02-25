package com.example.payShop.service;

import com.example.payShop.model.Payment;
import com.example.payShop.repository.PaymentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Transactional
    @Override
    public Payment processPayment(Long reservationId, double amount) {
        Payment payment = new Payment();
        payment.setReservationId(reservationId);
        payment.setAmount(amount);

        // Сохранение платежа в базе данных
        paymentRepository.save(payment);

        // Пример использования дополнительного метода
        List<Payment> paymentsForReservation = paymentRepository.findByReservationId(reservationId);

        return payment;
    }
}



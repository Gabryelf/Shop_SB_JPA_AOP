package com.example.reserveShop.service;

import com.example.reserveShop.model.Reservation;
import com.example.reserveShop.repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

@Service
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationServiceImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    @Transactional
    public Reservation reserveProduct(Long productId, int quantity) {
        // Логика резервирования товара
        // Например, создание объекта Reservation и сохранение его в базе данных
        Reservation reservation = new Reservation();
        reservation.setProductId(productId);
        reservation.setQuantity(quantity);
        reservationRepository.save(reservation);
        return reservation;
    }

    @Override
    public List<Reservation> getReservationsByProductId(Long productId) {
        // Получение списка резерваций для конкретного товара
        return reservationRepository.findByProductId(productId);
    }

    @Override
    @Transactional
    public void cancelReservation(Long reservationId) {
        // Отмена резервации товара
        reservationRepository.deleteById(reservationId);
    }

    // Другие методы, связанные с логикой резервирования
}



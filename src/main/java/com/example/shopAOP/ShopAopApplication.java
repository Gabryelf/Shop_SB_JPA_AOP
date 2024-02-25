package com.example.shopAOP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Разработать систему из WEB приложения магазин(достаточно один товар) и двух REST микросервисов
 * резервирования на складе и оплаты товара.
 * Необходимо использовать АОП для регистрации действий в системе и
 * измерений времени выполнения методов.
 * Обязательно использовать управление транзакциями при резервировании товара на складе и
 * переводах средств между счетами.
 * Внимание логировать все методы не нужно. Несколько, чтобы показать использование аспектов.
 *
 *
 * Вызов (старт) программы.
 */
@SpringBootApplication
public class ShopAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopAopApplication.class, args);
	}

}

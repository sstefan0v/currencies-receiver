package com.sstefanov.demo.currencies.receiver.repositories;

import com.sstefanov.demo.currencies.receiver.entities.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
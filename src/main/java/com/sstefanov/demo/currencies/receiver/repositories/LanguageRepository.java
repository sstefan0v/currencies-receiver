package com.sstefanov.demo.currencies.receiver.repositories;

import com.sstefanov.demo.currencies.receiver.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Long> {
}
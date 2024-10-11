package com.sstefanov.demo.currencies.receiver.services;

import com.sstefanov.demo.currencies.receiver.entities.Language;
import com.sstefanov.demo.currencies.receiver.repositories.LanguageRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Repository
public class DataBaseService {

    @Autowired
    private LanguageRepository languageRepository;

    @Transactional
    void persistToDb(List<Language> languages) {
        languageRepository.saveAll(languages);
        log.info("Currencies successfully saved to DB.");
    }
}
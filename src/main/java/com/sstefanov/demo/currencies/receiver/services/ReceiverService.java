package com.sstefanov.demo.currencies.receiver.services;

import com.sstefanov.demo.currencies.receiver.entities.Currency;
import com.sstefanov.demo.currencies.receiver.entities.Language;
import com.sstefanov.demo.currencies.receiver.json.Wrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ReceiverService {

    @Autowired
    private JsonMapperService jsonMapperService;

    @Autowired
    private DataBaseService dataBaseService;

    public  void handleMessage(String jsonString ) {
        Wrapper wrapper = jsonMapperService.toObject(jsonString);
        List<Language> languages = wrapper.getLanguages();

        languages.forEach(language -> language.setCurrencies(wrapper.getCurrencies()));
        dataBaseService.persistToDb(languages);
    }
}
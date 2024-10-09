package com.sstefanov.demo.currencies.receiver.json;

import com.sstefanov.demo.currencies.receiver.entities.Currency;
import com.sstefanov.demo.currencies.receiver.entities.Language;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Wrapper {
    private List<Currency> currencies;

    private List<Language> languages;
}

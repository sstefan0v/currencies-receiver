package com.sstefanov.demo.currencies.receiver.json;


import com.sstefanov.demo.currencies.receiver.entities.Currency;
import com.sstefanov.demo.currencies.receiver.entities.Language;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


import java.util.List;

@Getter
@Setter
public class Wrapper {
    private List<Currency> currencies;

    private List<Language> languages;

}

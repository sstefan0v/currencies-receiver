package com.sstefanov.demo.currencies.receiver.services;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@Getter
public class Props {

    @Value("${currency-updater.server.url}")
    private String currencyUpdaterServerUrl;

    @Value("${web-socket.text-message-size-limit}")
    private int wsTextMessageSizeLimit;

}

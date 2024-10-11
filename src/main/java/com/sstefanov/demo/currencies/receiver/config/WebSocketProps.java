package com.sstefanov.demo.currencies.receiver.config;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Slf4j
@Getter
@Setter
@ConfigurationProperties(prefix = "web-socket")
public class WebSocketProps {
    private int textMessageSizeLimit;
}

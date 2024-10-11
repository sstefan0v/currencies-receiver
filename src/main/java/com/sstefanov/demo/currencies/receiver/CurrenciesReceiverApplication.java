package com.sstefanov.demo.currencies.receiver;

import com.sstefanov.demo.currencies.receiver.config.ServerUrlProps;
import com.sstefanov.demo.currencies.receiver.config.WebSocketProps;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ServerUrlProps.class, WebSocketProps.class})
public class CurrenciesReceiverApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrenciesReceiverApplication.class, args);
	}
}

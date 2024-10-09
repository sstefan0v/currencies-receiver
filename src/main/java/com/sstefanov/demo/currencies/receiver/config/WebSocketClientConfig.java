package com.sstefanov.demo.currencies.receiver.config;

import com.sstefanov.demo.currencies.receiver.services.Props;
import com.sstefanov.demo.currencies.receiver.services.WebSocketService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;
import org.springframework.web.socket.WebSocketSession;


@EnableScheduling
@Configuration
@Slf4j
public class WebSocketClientConfig {

    @Autowired
    private WebSocketService webSocketService;

    @Autowired
    private Props props;

    private WebSocketSession session;

    @Scheduled(initialDelay = 100, fixedRate = 500)
    public void start() throws Exception {

        if (session == null || !session.isOpen()) {
            init();
        }
    }

    public void init() throws Exception {
        StandardWebSocketClient client = new StandardWebSocketClient();
        try {
            session = client.execute(webSocketService, props.getCurrencyUpdaterServerUrl()).get();
            session.setTextMessageSizeLimit(props.getWsTextMessageSizeLimit());
        } catch ( java.util.concurrent.ExecutionException e) {
            log.error("Cannot open WS session: " + e.getCause());
        }
    }
}


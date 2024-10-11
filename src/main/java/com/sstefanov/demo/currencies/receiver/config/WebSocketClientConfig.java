package com.sstefanov.demo.currencies.receiver.config;

import com.sstefanov.demo.currencies.receiver.services.WebSocketService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;

@Configuration
@Slf4j
@RequiredArgsConstructor
@EnableScheduling
public class WebSocketClientConfig {

    private final WebSocketService webSocketService;
    private final ServerUrlProps serverUrlProps;
    private final WebSocketProps webSocketProps;
    private WebSocketSession session;

    @Scheduled(initialDelay = 100, fixedRate = 5500)
    public void start() throws Exception {

        if (session == null || !session.isOpen()) {
            init();
        }
    }

    public void init() throws Exception {
        StandardWebSocketClient client = new StandardWebSocketClient();
        try {
            session = client.execute(webSocketService, serverUrlProps.getUrl()).get();
            session.setTextMessageSizeLimit(webSocketProps.getTextMessageSizeLimit());
        } catch (java.util.concurrent.ExecutionException e) {
            log.error("Cannot open WS session: " + e.getCause());
        }
    }
}


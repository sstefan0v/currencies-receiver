package com.sstefanov.demo.currencies.receiver.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Service
@Slf4j
public class WebSocketService extends TextWebSocketHandler {

    @Autowired
    private ReceiverService receiverService;

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) {
        log.debug("Message from Currencies Updater Server received: {}", message.getPayload());

        receiverService.handleMessage(message.getPayload());
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) {
        log.debug("WS session to server started.");
    }
}
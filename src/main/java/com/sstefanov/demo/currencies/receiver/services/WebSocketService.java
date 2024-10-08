package com.sstefanov.demo.currencies.receiver.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Service
@Slf4j
public class WebSocketService extends TextWebSocketHandler {

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) {
        System.out.println("Received: " + message.getPayload());
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) {
        log.debug("WS session to server started.");
    }
}
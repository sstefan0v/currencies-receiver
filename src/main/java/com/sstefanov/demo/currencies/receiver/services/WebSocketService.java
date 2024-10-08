package com.sstefanov.demo.currencies.receiver.services;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

@Service
@Slf4j
public class WebSocketService extends TextWebSocketHandler {

//    @Autowired
//    private JaxBParser jaxBParser;

//    private WebSocketSession session;

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) {
        // Log and handle incoming message
        System.out.println("Received: " + message.getPayload());
        // Echo the message back or process it
//        try {
////            session.sendMessage(new org.springframework.web.socket.TextMessage("Hello from Server A: " +  message.getPayload()));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }


    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws IOException {

        log.debug("WS session to server started.");
//        session.setTextMessageSizeLimit(9999999);
//        this.session = session;
    }

//    @Override
//    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws IOException {
//
//        System.out.println("Connection closed with Server A" + status);
//    }

//    public boolean send(String str)  {
//        if (session == null) {
//            return false;
//        }
//        try {
//            session.sendMessage(new TextMessage(str));
//        } catch (IOException e) {
//            log.error("there was an error sending ws message: ",e);
//        }
//        return true;
//    }


}
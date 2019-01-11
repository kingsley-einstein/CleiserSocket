package com.socket.cleiser.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import com.socket.cleiser.message.Message;

@Component
public class Producer {
    
    @Autowired
    private SimpMessagingTemplate simp;

    public void produce(String topic, Message message) {
        StringBuilder builder = new StringBuilder();
        builder.append(message.toString());
        simp.convertAndSend(String.format("/topic/%s", topic), builder.toString());
    }
}
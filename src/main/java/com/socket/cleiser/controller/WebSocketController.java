package com.socket.cleiser.controller;

import java.util.Date;

import com.socket.cleiser.message.Message;
import com.socket.cleiser.websocket.Producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebSocketController {

    @Autowired
    Producer producer;

    @RequestMapping("/send/{topic}")
    public void sendMessage(@PathVariable("topic") String topic, @RequestParam("username") String username, @RequestParam("pic") String pic, @RequestParam("message") String message) {
        producer.produce(topic, new Message(username, pic, new Date(), message));
    }
}
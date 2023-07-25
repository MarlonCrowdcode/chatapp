package com.example.chatapp.chat;

import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;

public enum MessageType {

    CHAT,
    JOIN,
    LEAVE,

    }




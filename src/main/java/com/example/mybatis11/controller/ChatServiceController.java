package com.example.mybatis11.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.example.mybatis11.dto.Chat;

@Controller
public class ChatServiceController {

	@MessageMapping("/chat")
	@SendTo("/topic/messages") // "/topic/chat-room-{invitation}"
	public Chat sendMessage(Chat chat) {
		// Save message to database via MyBatis
		return chat;
	}
}

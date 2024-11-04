package com.satish.chatappservice.controller;

/**
 * @author : Satish Yadav
 * @purpose :
 */
import com.satish.chatappservice.model.request.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/chat.sendMessage")  // Maps messages from the "/app/chat.sendMessage" endpoint
    @SendTo("/topic/public")  // Sends the message to all subscribers of "/topic/public"
    public ChatMessage sendMessage(ChatMessage chatMessage) {
        return chatMessage;
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
    public ChatMessage addUser(ChatMessage chatMessage) {
        chatMessage.setContent(chatMessage.getSender() + " joined the chat");
        return chatMessage;
    }
}


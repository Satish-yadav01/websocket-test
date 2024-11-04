package com.satish.chatappservice.model.request;

import lombok.*;

/**
 * @author : Satish Yadav
 * @purpose :
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ChatMessage {
    private String sender;
    private String content;
    private String type; // e.g., "CHAT", "JOIN", "LEAVE"
}

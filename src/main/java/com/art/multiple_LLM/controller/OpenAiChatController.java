package com.art.multiple_LLM.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenAiChatController {

    private final ChatClient chatClient;

    public OpenAiChatController(ChatClient chatClient) {
        this.chatClient = chatClient;
    }
}

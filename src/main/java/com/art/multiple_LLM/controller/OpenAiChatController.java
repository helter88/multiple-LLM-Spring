package com.art.multiple_LLM.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenAiChatController {

    private final ChatClient chatClient;

    public OpenAiChatController(@Qualifier("openAiChatClient") ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @GetMapping("/openai")
    public String openai() {
        return chatClient.prompt()
                .user("Tell me a joke about OpenAi")
                .call()
                .content();
    }
}

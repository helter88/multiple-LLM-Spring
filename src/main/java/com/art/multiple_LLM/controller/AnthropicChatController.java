package com.art.multiple_LLM.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnthropicChatController {

    private final ChatClient chatClient;

    public AnthropicChatController(@Qualifier("anthropicChatClient") ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @GetMapping("/claude")
    public String openai() {
        return chatClient.prompt()
                .user("Tell me a joke about Anthropic")
                .call()
                .content();
    }
}

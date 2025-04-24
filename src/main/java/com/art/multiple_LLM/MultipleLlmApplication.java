package com.art.multiple_LLM;

import org.springframework.ai.anthropic.AnthropicChatModel;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MultipleLlmApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultipleLlmApplication.class, args);
	}

	@Bean
	public ChatClient openAiChatClient(OpenAiChatModel chatModel){
		return ChatClient.create(chatModel);
	}

	@Bean
	public ChatClient anthropicChatClient(AnthropicChatModel chatModel){
		return ChatClient.create(chatModel);
	}
}

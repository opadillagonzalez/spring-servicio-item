package com.springapp.item.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
	
	@Bean("clienteRest")
	public RestTemplate registraRestTemplate() {
		return new RestTemplate();
	}
	
	
	
}

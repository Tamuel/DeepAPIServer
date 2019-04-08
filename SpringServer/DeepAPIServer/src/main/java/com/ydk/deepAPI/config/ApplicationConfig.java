package com.ydk.deepAPI.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ydk.deepAPI.controller.DeepServerController;


@Configuration
public class ApplicationConfig {

	@Bean
	public DeepServerController deepServerController() {
		DeepServerController controller = new DeepServerController(2);
		return controller;
	}
	
}

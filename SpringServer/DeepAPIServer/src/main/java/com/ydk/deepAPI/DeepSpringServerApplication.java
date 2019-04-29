package com.ydk.deepAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class DeepSpringServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeepSpringServerApplication.class, args);
	}

}

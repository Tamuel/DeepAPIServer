package com.ydk.detection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@SpringBootApplication
public class DetectSpringServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DetectSpringServerApplication.class, args);
	}

}

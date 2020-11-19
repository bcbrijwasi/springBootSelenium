package com.spring.springBootSelenium;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class SpringBootSeleniumApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSeleniumApplication.class, args);
	}

}

package com.bobby.cryptodemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class CryptoDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(CryptoDemoApplication.class, args);
	}
}

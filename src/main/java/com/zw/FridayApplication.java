package com.zw;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class FridayApplication {

	public static void main(String[] args) {
		log.trace("日志级别为trace");
		log.debug("日志级别为debug");
		log.info("日志级别为info");
		log.warn("日志级别为warn");
		log.error("日志级别为error");
		SpringApplication.run(FridayApplication.class, args);
	}

}

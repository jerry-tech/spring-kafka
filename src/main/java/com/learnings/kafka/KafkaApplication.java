package com.learnings.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = "com.learnings.kafka.cron")
@ComponentScan(basePackages = "com.learnings.kafka.controllers")
@ComponentScan(basePackages = "com.learnings.kafka.service")
public class KafkaApplication {



	public static void main(String[] args) {

		SpringApplication.run(KafkaApplication.class, args);
	}

}

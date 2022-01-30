package com.example.SpringBootEmailApplicationExample;

import com.example.SpringBootEmailApplicationExample.controller.MailController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootEmailApplicationExampleApplication implements CommandLineRunner {

	@Autowired
	private MailController mailController;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmailApplicationExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		mailController.sendMail();
	}
}

package com.example.hackathon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//,scanBasePackages="com.example.repository"
@SpringBootApplication(scanBasePackages="com.example.*")
public class HackathonApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackathonApplication.class, args);
	}

}

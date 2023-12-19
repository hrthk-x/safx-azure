package com.saf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SafApplication {

	public static void main(String[] args) {
		SpringApplication.run(SafApplication.class, args);
		System.out.println("saf started on port 8086");
	}

}

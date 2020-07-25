package com.microservicio.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.microservicio")
public class ContactApplication {
 public static void main(String[] args)
 {
	 SpringApplication.run(ContactApplication.class, args);
 }
}

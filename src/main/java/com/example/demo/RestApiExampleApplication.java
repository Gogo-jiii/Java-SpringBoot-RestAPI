package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.BookModel;
import com.example.demo.service.BookService;

@SpringBootApplication
public class RestApiExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiExampleApplication.class, args);
		
	}

}

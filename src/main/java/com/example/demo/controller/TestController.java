package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BookModel;
import com.example.demo.service.BookService;

@RestController
public class TestController {

	BookService bookService;

	@GetMapping("/books")
	public List<BookModel> getBooks() {
		bookService = BookService.getInstance();
		return bookService.getBooksFromDatabase();
	}

	@GetMapping("/books/{id}")
	public BookModel getBookByID(@PathVariable("id") int id) {
		bookService = BookService.getInstance();
		return bookService.getBookByID(id);
	}
	
	@GetMapping("/books/{id}/{name}")
	public BookModel getBookByIDAndName(@PathVariable("id") int id, @PathVariable("name") String name) {
		bookService = BookService.getInstance();
		return bookService.getBookByIDAndName(id, name);
	}
}

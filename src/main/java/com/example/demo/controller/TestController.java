package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	@PostMapping("/books")
	public void addBook(@RequestBody BookModel book) {
		bookService = BookService.getInstance();
		bookService.addBook(book);
	}
	
	@PutMapping("/books/{id}")
	public void updateBook(@PathVariable("id") int id, @RequestBody BookModel book) {
		bookService = BookService.getInstance();
		bookService.updateBook(id, book);
	}
	
	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable("id") int id) {
		bookService = BookService.getInstance();
		bookService.delete(id);
	}
}

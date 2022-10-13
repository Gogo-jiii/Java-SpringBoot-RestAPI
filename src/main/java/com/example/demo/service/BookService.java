package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.BookModel;

public class BookService {

	private static BookService instance = null;

	private BookService() {
	};

	public static BookService getInstance() {
		if (instance == null) {
			instance = new BookService();
			init();
		}
		return instance;
	}

	private static List<BookModel> list = new ArrayList<>();

	private static void init() {
		list.add(new BookModel(1, "Vaibhav 1", "Kalyan 1"));
		list.add(new BookModel(2, "Vaibhav 2", "Kalyan 2"));
		list.add(new BookModel(3, "Vaibhav 3", "Kalyan 3"));
	}

	public List<BookModel> getBooksFromDatabase() {
		return list;
	}

	public BookModel getBookByID(int id) {
		return list.stream().filter(e -> e.getID() == id).findFirst().get();
	}

	public BookModel getBookByIDAndName(int id, String name) {
		return list.stream().filter(e -> e.getID() == id && e.getName().equals(name)).findFirst().get();
	}

	public void updateBook(int id, BookModel book) {
		BookModel oldbook = list.stream().filter(e -> e.getID() == id).findFirst().get();
		oldbook.setName(book.getName());
		oldbook.setCity(book.getCity());
	}

	public void delete(int id) {
		BookModel book = list.stream().filter(e -> e.getID() == id).findFirst().get();
		list.remove(book);
	}

	public void addBook(BookModel book) {
		list.add(book);
	}
}

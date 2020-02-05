package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Book;
public interface BookService {
	
	public List<Book> getAllBooks();
	public Optional<Book> getBookById(Integer bookId);
	//public  void deleteBookById(Integer bookId);  
}
package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Book;
public interface BookService {
	
	public List<Book> getAllBooks();
	public Optional<Book> getBookById(Integer bookId);
	
	public Book createBook(Book book);
	public Book updateBook(Book book);
	public void deleteBookById(Integer bookId);  
	public void deleteAll();
	public List<Book> findByBookName(String bookName);
	public void deleteByBookName(String bookName);
	public List<Book> findByAuthorAndBookName(String author,String bookName);
}
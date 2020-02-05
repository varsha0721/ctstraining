package com.example.demo.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Book;

@Repository
@Transactional
public interface BookDAO extends JpaRepository<Book, Integer> {

	public List<Book> findByBookName(String bookName);
	public void deleteByBookName(String bookName);
	public List<Book> findByAuthorAndBookName(String author,String bookName);
}

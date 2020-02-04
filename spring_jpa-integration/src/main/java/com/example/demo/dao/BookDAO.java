package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Book;

@Repository
@Transactional
public interface BookDAO extends JpaRepository<Book, Integer> {

}

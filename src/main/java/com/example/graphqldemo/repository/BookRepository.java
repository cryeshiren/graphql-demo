package com.example.graphqldemo.repository;

import com.example.graphqldemo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> { }
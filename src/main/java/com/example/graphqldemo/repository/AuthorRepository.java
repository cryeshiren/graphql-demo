package com.example.graphqldemo.repository;

import com.example.graphqldemo.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> { }

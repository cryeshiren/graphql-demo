package com.example.graphqldemo.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphqldemo.model.Author;
import com.example.graphqldemo.model.Book;
import com.example.graphqldemo.repository.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class BookResolver implements GraphQLResolver<Book> {
    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Book book) {
        return authorRepository.findOne(book.getAuthor().getId());
    }
}

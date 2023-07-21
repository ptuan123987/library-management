package com.app.library.service;

import org.springframework.http.ResponseEntity;

import com.app.library.model.Book;

public interface BookService {
    public ResponseEntity<Book> getBook(int Id);
}

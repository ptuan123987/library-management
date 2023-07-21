package com.app.library.service;

import org.springframework.http.ResponseEntity;

import com.app.library.model.Book;

public interface BookServiceImpl {
    public ResponseEntity<Book> getBook(int Id);
}

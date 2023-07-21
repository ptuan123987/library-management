package com.app.library.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;

import com.app.library.model.Book;
import com.app.library.repository.BookRepository;

@Service
public class BookServiceImpl implements com.app.library.service.BookServiceImpl {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public ResponseEntity<Book> getBook(int Id) {
        Book book = bookRepository.findById(Id).orElseThrow(() -> new RuntimeException("can't find loan id:" + Id));

        return new ResponseEntity<>(book, HttpStatus.OK);

    }

}
package com.app.library.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;

import com.app.library.model.Book;
import com.app.library.repository.BookRepository;
import com.app.library.service.IBookService;

@Service
public class BookService implements IBookService{
    @Autowired
    private BookRepository bookRepository;

    @Override
    public ResponseEntity<Book> getBook(int Id) {
        Book book = bookRepository.findById(Id).orElseThrow(() -> new RuntimeException("can't find loan id:" + Id));

        return new ResponseEntity<>(book, HttpStatus.OK);

    }

}
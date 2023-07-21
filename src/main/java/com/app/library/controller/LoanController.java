package com.app.library.controller;

import com.app.library.model.User;
import com.app.library.service.impl.LoanServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("loan")
public class LoanController {

    @Autowired
    LoanServiceImpl loanService;
    @RequestMapping("{id}")
    public ResponseEntity<List<User>> getUserBorrowingById(@PathVariable("id") int id){

        return loanService.listUserBorrowing(id);
    }

}
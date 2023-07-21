package com.app.library.service.impl;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;

import com.app.library.model.*;
import com.app.library.repository.LoanRepository;
import com.app.library.service.ILoanService;

@Service
public class LoanService implements ILoanService {
    @Autowired
    private LoanRepository loanRepository;

    @Override
    public ResponseEntity<List<User>> listUserBorrowing(int Id) {
        Loan loan = loanRepository.findById(Id)
                .orElseThrow(() -> new RuntimeException("Cannot find loan with id: " + Id));
        List<User> usersBorrowing = new ArrayList<>();
        usersBorrowing.add(loan.getUser());
        System.out.println(usersBorrowing);
        return new ResponseEntity<>(usersBorrowing, HttpStatus.OK);
    }

}
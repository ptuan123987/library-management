package com.app.library.controller;

import com.app.library.model.ResponseObject;
import com.app.library.model.Loan;
import com.app.library.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("loan")
public class LoanController {

    @Autowired
    LoanRepository loanRepository;

    @RequestMapping("{id}")
    public ResponseEntity<ResponseObject> getUserById(@PathVariable("id") int id) {
        Optional<Loan> loan = loanRepository.findById(id);

        return loan.isPresent() ? ResponseEntity.status(HttpStatus.OK).body(
                new ResponseObject("ok", "Query loan successfully", loan)
        // you can replace "ok" with your defined "error code"
        )
                : ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                        new ResponseObject("failed", "Cannot find loan with id = " + id, ""));
    }
}

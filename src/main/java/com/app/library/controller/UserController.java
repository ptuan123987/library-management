package com.app.library.controller;

import com.app.library.model.ResponseObject;
import com.app.library.model.User;
import com.app.library.repository.UserRepository;
import com.app.library.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") int id){

        return userService.getUser(id);
    }

    @RequestMapping(value = "signup",method = RequestMethod.POST)
    public ResponseEntity<User> signUp(@RequestBody User user){
        return userService.addUser(user);
    }
}

package com.app.library.controller;

import com.app.library.model.User;
import com.app.library.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserServiceImpl userService;
    @RequestMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") int id){

        return userService.getUser(id);
    }

    @RequestMapping(value = "signup",method = RequestMethod.POST)
    public ResponseEntity<User> signUp(@RequestBody User user){
        return userService.addUser(user);
    }
}

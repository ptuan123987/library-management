package com.app.library.service.impl;

import com.app.library.model.ResponseObject;
import com.app.library.model.User;
import com.app.library.repository.UserRepository;
import com.app.library.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void signUp(User user) {
        userRepository.save(user);
    }

    public ResponseEntity<User> addUser(User user){
        String newEmail = user.getEmail();
        Optional<User> userEmailExisted = userRepository.findByEmail(newEmail);
        if(!userEmailExisted.isPresent()) {
            return new ResponseEntity<>(userRepository.save(user),HttpStatus.OK);
        }
        return new ResponseEntity<>(new User(),HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public void updateUser(int Id) {

    }

    @Override
    public void deleteUser(int Id) {

    }

    @Override
    public ResponseEntity<User>getUser(int Id) {
        User user = userRepository.findById(Id).orElseThrow(()-> new RuntimeException("can find user id:" + Id));

    return new ResponseEntity<>(user,HttpStatus.OK);


    }

    @Override
    public ResponseEntity<List<User>> listAll() {
        return null;
    }

    @Override
    public ResponseEntity<List<User>> listByGroup() {
        return null;
    }
}

package com.app.library.service;

import com.app.library.model.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    public void signUp(User user);

    public void updateUser(int Id);
    public void deleteUser(int Id);

    public ResponseEntity<User> getUser(int Id);
    public ResponseEntity<List<User>>listAll();

    public ResponseEntity<List<User>> listByGroup();

}

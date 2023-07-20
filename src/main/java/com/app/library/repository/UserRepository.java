package com.app.library.repository;

import com.app.library.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< HEAD
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
=======
public interface UserRepository extends JpaRepository<User, Integer> {
>>>>>>> origin/master
}

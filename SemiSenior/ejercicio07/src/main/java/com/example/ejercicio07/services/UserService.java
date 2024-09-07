package com.example.ejercicio07.services;

import com.example.ejercicio07.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface UserService {

    User saveUser(User user);
    List<User> findAllUsers();
    Optional<User> findUserById(Long id);
    User updateUser(Long id, User user);
    void deleteUser(Long id);



}

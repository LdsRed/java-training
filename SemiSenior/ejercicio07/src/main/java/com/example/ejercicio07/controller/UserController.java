package com.example.ejercicio07.controller;


import com.example.ejercicio07.model.User;
import com.example.ejercicio07.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ejercicio07/users")
public class UserController {

    @Autowired
    private UserServiceImpl userService;


    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id){
        Optional<User> user = userService.findUserById(id);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }


    @GetMapping
    public List<User> getAllUsers(){
        return userService.findAllUsers();
    }


    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User savedUser = userService.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }


    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user){
        try {
            User userToUpdate = userService.updateUser(id, user);
            return ResponseEntity.ok(userToUpdate);
        }catch ( RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable Long id){

        try{
            Optional<User> user = userService.findUserById(id);
            return user.map(ResponseEntity::ok).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }



}

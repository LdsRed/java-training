package com.example.ejercicio07.services;


import com.example.ejercicio07.model.User;
import com.example.ejercicio07.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{


    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User updateUser(Long id, User user) {
       return userRepository.findById(id).
               map( usuarioExistente -> {
                   usuarioExistente.setFirstName(user.getFirstName());
                   usuarioExistente.setLastName(user.getLastName());
                   usuarioExistente.setEmail(user.getEmail());
                   return userRepository.save(usuarioExistente);
               }).
               orElseThrow( () -> new NoSuchElementException("Elemento no encontrado.."));
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

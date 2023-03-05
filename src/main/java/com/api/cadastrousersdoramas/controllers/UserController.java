package com.api.cadastrousersdoramas.controllers;

import com.api.cadastrousersdoramas.entities.User;
import com.api.cadastrousersdoramas.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuaria")
public class UserController {

    @Autowired
    private UsersRepository repository;

    @GetMapping
    public List<User> findAll() {
        List<User> resultado = repository.findAll();
        return resultado;

    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id) {
        User resultado = repository.findById(id).get();
        return resultado;


    }

    @PostMapping
    public User insert(@RequestBody User users) {
        User resultado = repository.save(users);
        return resultado;


        }

    }


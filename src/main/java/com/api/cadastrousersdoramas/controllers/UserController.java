package com.api.cadastrousersdoramas.controllers;

import com.api.cadastrousersdoramas.entities.Users;
import com.api.cadastrousersdoramas.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuaria")
public class UserController {

    @Autowired
    private UsersRepository repository;

    @GetMapping
    public List<Users> findAll() {
        List<Users> resultado = repository.findAll();
        return resultado;

    }

    @GetMapping(value = "/{id}")
    public Users findById(@PathVariable Long id) {
        Users resultado = repository.findById(id).get();
        return resultado;


    }

    @PostMapping
    public Users insert(@RequestBody Users users) {
        Users resultado = repository.save(users);
        return resultado;


        }

    }


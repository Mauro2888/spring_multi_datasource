package com.mauro.datasource.controller;


import com.mauro.datasource.entity.UserEntity;
import com.mauro.datasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }


    @PostMapping("/create")
    public ResponseEntity<UserEntity>addUser(@RequestBody UserEntity userEntity){
        service.createUser(userEntity);
        return ResponseEntity.ok(userEntity);
    }

    @GetMapping("/getUsers")
    public List<UserEntity> getAllUsers(){
        return service.findAllUsers();
    }

}

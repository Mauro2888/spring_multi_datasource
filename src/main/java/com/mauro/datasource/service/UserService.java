package com.mauro.datasource.service;


import com.mauro.datasource.entity.UserEntity;
import com.mauro.datasource.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void createUser(UserEntity userEntity){
        repository.save(userEntity);
    }
    public List<UserEntity>findAllUsers(){
        return repository.findAll();
    }

}

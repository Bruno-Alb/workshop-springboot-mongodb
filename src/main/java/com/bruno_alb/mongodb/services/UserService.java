package com.bruno_alb.mongodb.services;

import com.bruno_alb.mongodb.domain.User;
import com.bruno_alb.mongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll (){
        return repo.findAll();
    }
}

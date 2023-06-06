package com.exam.usershttpserver.services;


import com.exam.usershttpserver.models.User;
import com.exam.usershttpserver.repositories.UserRepository;

import java.util.List;

public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }
    public void addDummyData(){
        userRepository.fill();
    }

}

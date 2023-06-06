package com.exam.usershttpserver.services;


import com.exam.usershttpserver.models.User;
import com.exam.usershttpserver.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
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

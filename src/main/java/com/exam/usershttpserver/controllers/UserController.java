package com.exam.usershttpserver.controllers;

import com.exam.usershttpserver.services.UserService;
import org.springframework.web.bind.annotation.*;
import com.exam.usershttpserver.models.User;

import java.util.List;

@RestController()
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/all")
    public List<User> getAll(){
        return userService.getAll();
    }
    @GetMapping("/fill")
    public String fill(){
        userService.addDummyData();
        return "Success";
    }
}

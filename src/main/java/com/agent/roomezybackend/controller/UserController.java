package com.agent.roomezybackend.controller;

import com.agent.roomezybackend.model.User;
import com.agent.roomezybackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController
{
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registration(@RequestBody User user)
    {
        return userService.userRegistration(user);
    }

    @GetMapping("/users")
    public List<User> getAllaUsers()
    {
        return userService.getAllusers();
    }
}

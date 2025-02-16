package com.agent.roomezybackend.service;

import com.agent.roomezybackend.model.Role;
import com.agent.roomezybackend.model.User;
import com.agent.roomezybackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;



   //private PasswordEncoder passwordEncoder=new BCryptPasswordEncoder(5);


    public String userRegistration(User user)
    {
        User newUser = new User();
        newUser.setName(user.getName());
        //newUser.setPassword(passwordEncoder.encode(user.getPassword()));
        newUser.setPassword(user.getPassword());
        newUser.setEmail(user.getEmail());
        newUser.setPhone(user.getPhone());
        newUser.setRole(Role.valueOf("USER"));
        userRepository.save(newUser);
        return "User Registerd Successfully";
    }

    public List<User> getAllusers()
    {
        return userRepository.findAll();
    }
}

package com.example.TaskManagementProject.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.TaskManagementProject.model.User;
import com.example.TaskManagementProject.repositories.UserRepository;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:4200")
public class UserController {

    @Autowired
    private UserRepository uRepo;
    @Autowired
    private EmailService emailService;
    
    @PostMapping("/signup")
    public Map<String, String> signup(@RequestBody User user) {
        Map<String, String> response = new HashMap<>();

        Optional<User> existingUser = uRepo.findByUserName(user.getUserName());
        if (existingUser.isPresent()) {
            response.put("message", "User already exists!");
            return response;
        }

        uRepo.save(user);
        emailService.sendSignupEmail(user.getUserName());
        response.put("message", "Signup successful! Please login.");
        return response;
    }


    @PostMapping("/login")
    public Map<String, String> login(@RequestBody User user) {
        Map<String, String> response = new HashMap<>();

        Optional<User> optionalUser = uRepo.findByUserName(user.getUserName());

        if (optionalUser.isPresent() && optionalUser.get().getPassword().equals(user.getPassword())) {
            String token = "fake-jwt-token-" + System.currentTimeMillis(); // Fake token for now
            response.put("message", "Login successful!");
            response.put("token", token);
        } else {
            response.put("message", "Invalid credentials!");
        }
        return response;
    }
}

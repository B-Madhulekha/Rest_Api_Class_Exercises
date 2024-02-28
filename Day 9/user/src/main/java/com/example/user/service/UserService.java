package com.example.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user.model.User;
import com.example.user.repository.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User addUser(User user) {
        return userRepo.save(user);
    }

    public User getUserById(int userId) {
        return userRepo.findById(userId);
    }

    public User getUserByName(String userName) {
        return userRepo.findByUserName(userName);}
}
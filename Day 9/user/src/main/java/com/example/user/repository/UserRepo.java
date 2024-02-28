package com.example.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.user.model.User;

public interface UserRepo extends JpaRepository<User,Integer> {

    @SuppressWarnings("unchecked")
    User save(User user);

    User findById(int userId);

    User findByUserName(String userName);
}
package com.example.door.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.door.model.Door;

@Repository
public interface DoorRepo {

    List<Door> findAll();

    Door findById(int doorId);

    List<Door> findByAccessType(String accessType);

    Door save(Door door);
}

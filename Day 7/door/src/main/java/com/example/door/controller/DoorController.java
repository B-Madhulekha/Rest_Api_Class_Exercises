package com.example.door.controller;

import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.door.model.Door;
import com.example.door.service.DoorService;

@RestController
@RequestMapping("/api/door")
public class DoorController {

    private final DoorService doorService;

    // @Autowired
    public DoorController(DoorService doorService) {
        this.doorService = doorService;
    }

    @PostMapping
    public ResponseEntity<Door> createDoor(@RequestBody Door door) {
        Door createdDoor = doorService.createDoor(door);
        return new ResponseEntity<>(createdDoor, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Door>> getAllDoors() {
        List<Door> doors = doorService.getAllDoors();
        return new ResponseEntity<>(doors, HttpStatus.OK);
    }

    @GetMapping("/{doorId}")
    public ResponseEntity<Door> getDoorById(@PathVariable int doorId) {
        Door door = doorService.getDoorById(doorId);
        return new ResponseEntity<>(door, HttpStatus.OK);
    }

    @GetMapping("/accesstype/{accessType}")
    public ResponseEntity<List<Door>> getDoorsByAccessType(@PathVariable String accessType) {
        List<Door> doorsByAccessType = doorService.getDoorsByAccessType(accessType);
        return new ResponseEntity<>(doorsByAccessType, HttpStatus.OK);
    }
}

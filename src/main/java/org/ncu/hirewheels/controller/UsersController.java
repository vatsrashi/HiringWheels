package org.ncu.hirewheels.controller;

import org.ncu.hirewheels.entities.users;
import org.ncu.hirewheels.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @PostMapping("/add")
    public ResponseEntity<String> addUsers(@RequestBody users user) {
        String newUser = usersService.addUsers(user);
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<users> getUserById(@PathVariable("id") Integer userId) {
        users user = usersService.getUser(userId);
        if (user != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<users> updateUser(@PathVariable("id") Integer userId, @RequestBody users updatedUser) {
        users updated = usersService.updateUser(userId, updatedUser);
        if (updated != null) {
            return new ResponseEntity<>(updated, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable("id") Integer userId) {
        usersService.deleteUser(userId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

package org.ncu.hirewheels.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.ncu.hirewheels.entities.users;
import org.ncu.hirewheels.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    UsersRepository usersRepository;

    @Override
    public String addUsers(users user) {
        users u = usersRepository.save(user);
        if (u == null)
            return "Failed to save the user details!!!!";
        return "User saved successfully with id -> " + u.getUserId();
    }

    @Override
    public Map<Integer, users> fetchAllUsers() {
        List<users> userList = usersRepository.findAll();
        Map<Integer, users> userMap = new HashMap<>();
        
        for (users user : userList) {
            userMap.put(user.getUserId(), user);
        }
        
        return userMap;
    }

    @Override
    public users updateUser(int userId, users user) {
        Optional<users> optionalUser = usersRepository.findById(userId);

        if (optionalUser.isPresent()) {
            users existingUser = optionalUser.get();
            // Update the user attributes with the values from the provided user object
            existingUser.setFirstName(user.getFirstName());
            existingUser.setLastName(user.getLastName());
            existingUser.setPassword(user.getPassword());
            existingUser.setEmail(user.getEmail());
            existingUser.setMobileNo(user.getMobileNo());
            users updatedUser = usersRepository.save(existingUser);
            return updatedUser;
        } else {
            return null; // User with the provided ID not found
        }
    }

    @Override
    public void deleteUser(int userId) {
        // Delete the user with the provided ID
        usersRepository.deleteById(userId);
        System.out.println("User deleted successfully!!");
    }
    @Override
    public users getUser(String email, String password) {
        users user = usersRepository.findByEmail(email);
        
        if (user == null) {
            System.out.println("User not Registered");
        } else if (!user.getPassword().equals(password)) {
            System.out.println("Unauthorized User");
        }
        
        return user;
    }
    @Override
    public users getUser(Integer userId) {
        Optional<users> user = usersRepository.findById(userId);
        return user.orElse(null);
    }
}
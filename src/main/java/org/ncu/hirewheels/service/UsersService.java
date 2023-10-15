package org.ncu.hirewheels.service;

import java.util.Map;

import org.ncu.hirewheels.entities.users;

public interface UsersService {
public String addUsers(users user);
public Map<Integer, users> fetchAllUsers();
public users updateUser(int userId, users user);
public void deleteUser(int userId);
public users getUser(String email, String password);
public users getUser(Integer userId);

}

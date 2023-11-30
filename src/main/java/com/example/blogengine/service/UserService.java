package com.example.blogengine.service;

import com.example.blogengine.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private List<User> users = new ArrayList<>();

    public List<User> getAllUsers() {
        return users;
    }

    public Optional<User> getUserById(Long userId) {
        return users.stream().filter(user -> user.getId().equals(userId)).findFirst();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void updateUser(Long userId, User updatedUser) {
        getUserById(userId).ifPresent(user -> {
            user.setUsername(updatedUser.getUsername());
            user.setPassword(updatedUser.getPassword());
            user.setEmail(updatedUser.getEmail());
        });
    }

    public void deleteUser(Long userId) {
        users.removeIf(user -> user.getId().equals(userId));
    }
}

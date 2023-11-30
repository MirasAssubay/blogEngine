package com.example.blogengine.controller;


import com.example.blogengine.dto.UserDTO;
import com.example.blogengine.entity.User;
import com.example.blogengine.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/byId")
    public ResponseEntity<Optional<User>> findUserByName(@RequestParam(name = "id") Long id) {
        Optional<User> user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<User> createUser(@RequestBody UserDTO userDTO) {
        String name = userDTO.getUsername();
        String password = userDTO.getPassword();
        String email = userDTO.getEmail();
        User user = new User(name, password, email);
        userService.addUser(user);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<Void> deleteClient(@RequestParam(name = "id") Long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{userId}")
    public ResponseEntity<User> updateUser(@PathVariable Long userId, @RequestBody UserDTO updatedUserDTO) {
        // Convert UserDTO to User entity and call the service to update the user
        User updatedUser = new User(updatedUserDTO.getUsername(), updatedUserDTO.getPassword(), updatedUserDTO.getEmail());
        userService.updateUser(userId, updatedUser);
        return ResponseEntity.ok(updatedUser);
    }
}

package com.example.blogengine.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private static Long idCounter = 1L;

    private Long id;
    private String username;
    private String password;
    private String email;

    public User(String username, String password, String email) {
        this.id = idCounter++;
        this.username = username;
        this.password = password;
        this.email = email;
    }

}

package com.example.blogengine.entity;

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

    public Long getId() {
        return id;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
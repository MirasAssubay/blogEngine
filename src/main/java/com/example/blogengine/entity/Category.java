package com.example.blogengine.entity;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private static Long idCounter = 1L;

    private Long id;
    private String name;
    private String description;
    private List<Post> posts = new ArrayList<>();

    public Category(String name, String description) {
        this.id = idCounter++;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}

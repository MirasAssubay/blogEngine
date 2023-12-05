package com.example.blogengine.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
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

}

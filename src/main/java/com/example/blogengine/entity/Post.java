package com.example.blogengine.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Post {
    private static Long idCounter = 1L;

    private Long id;
    private String title;
    private String content;
    private User author;
    private List<Comment> comments = new ArrayList<>();
    private List<Category> categories = new ArrayList<>();

    public Post(String title, String content, User author) {
        this.id = idCounter++;
        this.title = title;
        this.content = content;
        this.author = author;
    }

//    public Post(String title, String content, User author) {
//        this.id = idCounter++;
//        this.title = title;
//        this.content = content;
//        this.author = author;
//    }
}

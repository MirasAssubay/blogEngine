package com.example.blogengine.entity;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Comment {
    private static Long idCounter = 1L;

    private Long id;
    private String content;
    private User user;
    private Post post;

    public Comment(String content, User user, Post post) {
        this.id = idCounter++;
        this.content = content;
        this.user = user;
        this.post = post;
    }

}

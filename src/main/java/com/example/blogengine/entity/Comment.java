package com.example.blogengine.entity;

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

    public Long getId() {
        return id;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}

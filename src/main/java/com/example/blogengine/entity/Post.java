package com.example.blogengine.entity;

import java.util.ArrayList;
import java.util.List;

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


    public void setId(long id){
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}

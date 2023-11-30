package com.example.blogengine.service;

import com.example.blogengine.entity.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    private final List<Post> posts = new ArrayList<>();

    public List<Post> getAllPosts() {
        return posts;
    }

    public Optional<Post> getPostById(Long postId) {
        return posts.stream().filter(post -> post.getId().equals(postId)).findFirst();
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public void updatePost(Long postId, Post updatedPost) {
        getPostById(postId).ifPresent(post -> {
            post.setTitle(updatedPost.getTitle());
            post.setContent(updatedPost.getContent());
            // You may want to update other fields as well
        });
    }

    public void deletePost(Long postId) {
        posts.removeIf(post -> post.getId().equals(postId));
    }
}

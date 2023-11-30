package com.example.blogengine.dto;

public class PostCreateRequestDto {

    private String name;

    public PostCreateRequestDto() {
    }

    public PostCreateRequestDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

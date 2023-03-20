package com.example.application.components.appnav.backend.dto.request;

public class CreateUserDto {
    private long id;
    private String name;

    public CreateUserDto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

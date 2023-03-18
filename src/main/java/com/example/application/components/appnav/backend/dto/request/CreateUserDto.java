package com.example.application.components.appnav.backend.dto.request;

import java.lang.reflect.Type;

public class CreateUserDto {
    private Type role;
    private String email;
    private String name;
    private String phoneNumber;

    public CreateUserDto() {
    }

    public CreateUserDto(Type role, String email, String name, String phoneNumber) {
        this.role = role;
        this.email = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Type getRole() {
        return role;
    }

    public void setRole(Type role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

package com.example.application.components.appnav.backend.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.lang.reflect.Type;


@Table(name = "user")
@Setter
@Getter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "role")
    Type role;
    @Column(name = "name")
    String name;
    @Column(name = "login")
    String login;
    @Column(name = "password")
    String password;
    @Column(name = "email")
    String email;
    @Column(name = "phoneNumber")
    String phoneNumber;
}

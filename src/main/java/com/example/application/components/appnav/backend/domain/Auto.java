package com.example.application.components.appnav.backend.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Table(name = "auto")
@Setter
@Getter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "idUser")
    long idUser;
    @Column(name = "brand")
    String brand;
    @Column(name = "model")
    String model;
    @Column(name = "registrationNumber")
    String registrationNumber;
}

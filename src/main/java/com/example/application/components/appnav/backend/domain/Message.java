package com.example.application.components.appnav.backend.domain;

import com.vaadin.flow.component.template.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.lang.reflect.Type;

@Table(name = "message")
@Setter
@Getter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "typeOfSms")
    Type typeOfSms;
    @Column(name = "header")
    String header;
    @Column(name = "body")
    String body;
}

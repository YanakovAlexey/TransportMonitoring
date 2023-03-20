package com.example.application.components.appnav.backend.dto.request;

import java.lang.reflect.Type;

public class CreateMessageDto {
    private long id;
    private String header;
    private String body;
    private Type typeOfSms;

    public CreateMessageDto(){}

    public long getId() {return id;}
    public void setId(long id) {this.id = id;}
    public String getHeader() {return header;}
    public void setHeader(String header) {this.header = header;}
    public String getBody() {return body;}
    public void setBody(String body) {this.body = body;}
    public Type getTypeOfSms() {return typeOfSms;}
    public void setTypeOfSms(java.lang.reflect.Type typeOfSms) {
        this.typeOfSms = typeOfSms;
    }
}

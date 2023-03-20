package com.example.application.components.appnav.backend.dto.response;

import java.lang.reflect.Type;

public class MessageDto {
    private String header;
    private String body;
    private Type typeOfSms;

    public MessageDto(){}

    public MessageDto(String header, String body, Type typeOfSms) {
        this.header = header;
        this.body = body;
        this.typeOfSms = typeOfSms;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Type getTypeOfSms() {
        return typeOfSms;
    }

    public void setTypeOfSms(Type typeOfSms) {
        this.typeOfSms = typeOfSms;
    }
}

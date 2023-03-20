package com.example.application.components.appnav.backend.service;

import com.example.application.components.appnav.backend.dto.request.CreateUserDto;
import com.example.application.components.appnav.backend.dto.response.UserDto;

public interface UserService {
    public UserDto create(CreateUserDto createUserDto);


}

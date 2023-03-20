package com.example.application.components.appnav.backend.service.impl;

import com.example.application.components.appnav.backend.dto.request.CreateUserDto;
import com.example.application.components.appnav.backend.dto.response.UserDto;
import com.example.application.components.appnav.backend.repository.UserRepository;
import com.example.application.components.appnav.backend.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDto create(CreateUserDto createUserDto) {
        var user = UserBuilder.userDtoToUser(createUserDto);
        var isEmailExists = userRepository.isEmailExists(user.getEmail());
        var isPhoneNumberExists = userRepository.islPhoneNumberExists(user.getPhoneNumber());
        if (isEmailExists || isPhoneNumberExists) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        var userOpt = userRepository.save(user);
        return UserBuilder.userToUserDto(userOpt);
    }
}


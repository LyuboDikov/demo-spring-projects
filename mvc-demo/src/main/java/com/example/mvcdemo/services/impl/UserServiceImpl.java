package com.example.mvcdemo.services.impl;

import com.example.mvcdemo.dtos.UserRegisterDto;
import com.example.mvcdemo.entities.User;
import com.example.mvcdemo.repositories.UserRepository;
import com.example.mvcdemo.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper mapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }

    @Override
    public boolean register(UserRegisterDto userRequest) {

        if (this.userRepository.existsByUsernameOrEmail(
                userRequest.getUsername(),
                userRequest.getEmail())) {

            return false;
        }

        if (!userRequest.getPassword().equals(userRequest.getConfirmPassword())) {
            return false;
        }

        var user = this.mapper.map(
                userRequest, User.class
        );

        this.userRepository.save(user);

        return true;
    }
}

package com.example.mvcdemo.services;

import com.example.mvcdemo.dtos.UserLoginDto;
import com.example.mvcdemo.dtos.UserRegisterDto;

public interface UserService {

    boolean register(UserRegisterDto user);

    Long validateUserLoginDetails(UserLoginDto user);

}

package com.example.mvcdemo.controllers;

import com.example.mvcdemo.dtos.UserRegisterDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/users/register")
    private String register() {
        return "user/register";
    }

    @PostMapping("/users/register")
    public String register(UserRegisterDto userRegisterDto) {
        return "user/register";
    }
}

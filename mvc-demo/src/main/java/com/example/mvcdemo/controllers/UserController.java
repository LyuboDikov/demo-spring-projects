package com.example.mvcdemo.controllers;

import com.example.mvcdemo.dtos.UserRegisterDto;
import com.example.mvcdemo.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/register")
    private String register() {
        return "user/register";
    }

    @PostMapping("/users/register")
    public String register(UserRegisterDto userRegisterDto, Model model) {

        if (this.userService.register(userRegisterDto)) {
            return "redirect:/users/login";
        }

        model.addAttribute("error", "There's an error");

        return "user/register";
    }

    @GetMapping("/users/login")
    public String login() {
        return "user/login";
    }
}


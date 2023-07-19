package com.example.mvcdemo.controllers;

import com.example.mvcdemo.dtos.UserLoginDto;
import com.example.mvcdemo.dtos.UserRegisterDto;
import com.example.mvcdemo.services.UserService;
import jakarta.servlet.http.HttpServletRequest;
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

    @PostMapping("/users/login")
    public String login(UserLoginDto user, Model model, HttpServletRequest request) {
        var userId = this.userService.validateUserLoginDetails(user);
        if (userId == null) {
            model.addAttribute("error", "There's an error");
            return "user/login";
        }

        request.getSession().setAttribute("userId", userId);

        return "redirect:/";
    }
}


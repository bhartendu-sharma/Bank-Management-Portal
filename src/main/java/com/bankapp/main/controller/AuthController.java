package com.bankapp.main.controller;

import com.bankapp.main.enums.Role;
import com.bankapp.main.entity.User;
import com.bankapp.main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class AuthController {

    private final UserService userService;

    @Autowired
    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping("/register")
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            // If there are validation errors, return to the registration form
            return "registration";
        }

        // Check if the username or email already exists in the database
        if (userService.existsByUsername(user.getUsername())) {
            model.addAttribute("usernameError", "Username already exists");
        }

        if (userService.existsByEmail(user.getEmail())) {
            model.addAttribute("emailError", "Email already exists");
        }
        if (model.containsAttribute("usernameError")||model.containsAttribute("emailError")){
            return "registration";
        }

        // Set role as admin for registration
        user.setRole(Role.ADMIN);
        userService.saveUser(user);
        return "redirect:/user/login";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@ModelAttribute("user") User user, Model model) {
        // Retrieve user from the database using username and role
        User existingUser = userService.findUserByUsernameAndRole(user.getUsername(), Role.ADMIN);

        // Check if the user exists and the password matches
        if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
            // Redirect to dashboard after successful login
            return "redirect:/";
        } else {
            // If login fails, add an error attribute to the model
            model.addAttribute("error", "Invalid username or password. Please try again.");
            return "login";
        }
    }
}

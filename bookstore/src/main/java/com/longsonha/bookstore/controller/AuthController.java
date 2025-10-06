package com.longsonha.bookstore.controller;

import com.longsonha.bookstore.model.User;
import com.longsonha.bookstore.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    private final UserRepository userRepo;
    private final BCryptPasswordEncoder encoder;

    public AuthController(UserRepository userRepo, BCryptPasswordEncoder encoder) {
        this.userRepo = userRepo;
        this.encoder = encoder;
    }

    // =============== USER LOGIN / REGISTER ==================
    @GetMapping("/user/login")
    public String userLogin() {
        return "user-login";
    }

    @GetMapping("/user/register")
    public String userRegisterForm(Model model) {
        model.addAttribute("user", new User());
        return "user-register";
    }

    @PostMapping("/user/register")
    public String registerUser(@ModelAttribute("user") User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        user.setRole("USER");
        userRepo.save(user);
        return "redirect:/user/login?success";
    }

    //ADMIN LOGIN
    @GetMapping("/admin/login")
    public String adminLogin() {
        return "admin-login";
    }

}

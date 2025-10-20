package com.longsonha.bookstore.controller;

import com.longsonha.bookstore.model.User;
import com.longsonha.bookstore.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepo;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public UserController(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    //  Trang chủ sau khi login user
    @GetMapping("/home")
    public String userHome() {
        return "user-home"; // templates/user-home.html
    }

    //  Danh sách user
    @GetMapping("/list")
    public String listUsers(Model model) {
        model.addAttribute("listUsers", userRepo.findAll());
        return "user-list";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("user", new User());
        return "user-form";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute User user) {
        // Ma hoa Password
        user.setPassword(encoder.encode(user.getPassword()));
        if (user.getRole() == null || user.getRole().isEmpty()) {
            user.setRole("USER");
        }
        userRepo.save(user);
        return "redirect:/user/list";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("user", userRepo.findById(id).orElseThrow());
        return "user-form";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userRepo.deleteById(id);
        return "redirect:/user/list";
    }
}

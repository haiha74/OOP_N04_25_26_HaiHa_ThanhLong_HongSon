package com.longsonha.bookstore.controller;

import com.longsonha.bookstore.model.User;
import com.longsonha.bookstore.service.SachService;
import com.longsonha.bookstore.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    private final SachService sachService;
    private final UserService userService;

    public UserController(SachService sachService, UserService userService) {
        this.sachService = sachService;
        this.userService = userService;
    }

    // Trang chu cho User
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("books", sachService.getAll());
        return "user-home";
    }

    // Dat hang
    @GetMapping("/order/{tenSach}")
    public String orderForm(@PathVariable String tenSach, Model model) {
        User user = new User();
        user.setTenSach(tenSach);
        model.addAttribute("user", user);
        return "user-form";
    }

    // Luu thong tin User ve DataBase
    @PostMapping("/save")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.save(user);
        return "redirect:/user/home?success";
    }

    // CRUD Admin
    @GetMapping("/list")
    public String listUsers(Model model) {
        model.addAttribute("users", userService.getAll());
        return "admin-user-list";
    }
}

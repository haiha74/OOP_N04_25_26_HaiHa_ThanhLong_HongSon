package com.longsonha.bookstore.controller;

import com.longsonha.bookstore.model.User;
import com.longsonha.bookstore.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/nhanvien/user")
public class NhanVienUserController {

    private final UserService userService;

    public NhanVienUserController(UserService userService) {
        this.userService = userService;
    }

    // Danh sách khách hàng
    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("users", userService.getAll());
        return "nhanvien-user-list";
    }

    // Form thêm khách hàng
    @GetMapping("/new")
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "nhanvien-user-form";
    }

    // Lưu khách hàng
    @PostMapping("/save")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.save(user);
        return "redirect:/nhanvien/user/list";
    }

    // Sửa thông tin khách hàng
    @GetMapping("/edit/{id}")
    public String editUser(@PathVariable Long id, Model model) {
        model.addAttribute("user", userService.findById(id));
        return "nhanvien-user-form";
    }

    // Xóa khách hàng
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.delete(id);
        return "redirect:/nhanvien/user/list";
    }
}

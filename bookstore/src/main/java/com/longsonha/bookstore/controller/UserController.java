package com.longsonha.bookstore.controller;

import com.longsonha.bookstore.model.User;
import com.longsonha.bookstore.model.Sach;
import com.longsonha.bookstore.service.SachService;
import com.longsonha.bookstore.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private final SachService sachService;
    private final UserService userService;

    public UserController(SachService sachService, UserService userService) {
        this.sachService = sachService;
        this.userService = userService;
    }

    // Phần User
    // Trang chủ: hiển thị danh sách sách
    @GetMapping("/user/home")
    public String home(Model model) {
        model.addAttribute("books", sachService.getAll());
        return "user-home";
    }

    // Trang form đặt hàng cho khách
    @GetMapping("/user/order/{tenSach}")
    public String orderForm(@PathVariable String tenSach, Model model) {
        User user = new User();
        user.setTenSach(tenSach);
        model.addAttribute("user", user);
        return "user-form";
    }

    // Lưu thông tin khách hàng vào DB
    @PostMapping("/user/save")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.save(user);
        return "redirect:/user/home?success";
    }

    // Phần Admin
    // Hiển thị danh sách khách hàng (từ bảng users)
    @GetMapping("/admin/users")
    public String listUsers(Model model) {
        model.addAttribute("users", userService.getAll());
        return "admin/user-list"; // => templates/admin/user-list.html
    }

    // Form thêm khách hàng (admin thêm thủ công)
    @GetMapping("/admin/users/new")
    public String newUserForm(Model model) {
        model.addAttribute("user", new User());
        return "admin/user-form";
    }

    // Lưu khách hàng (admin thêm/sửa)
    @PostMapping("/admin/users/save")
    public String saveUserAdmin(@ModelAttribute("user") User user) {
        userService.save(user);
        return "redirect:/admin/users";
    }

    // Form sửa thông tin khách hàng
    @GetMapping("/admin/users/edit/{id}")
    public String editUser(@PathVariable Long id, Model model) {
        User u = userService.getById(id);
        model.addAttribute("user", u);
        return "admin/user-form";
    }

    // Xóa khách hàng
    @GetMapping("/admin/users/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.delete(id);
        return "redirect:/admin/users";
    }
}

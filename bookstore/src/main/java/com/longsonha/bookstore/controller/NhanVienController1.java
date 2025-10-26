package com.longsonha.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NhanVienController1 {

    // Trang đăng nhập nhân viên
    @GetMapping("/nhanvien/login")
    public String login() {
        return "nhanvien-login"; // Giao diện đăng nhập nhân viên
    }

    // Trang dashboard sau khi đăng nhập
    @GetMapping("/nhanvien/dashboard")
    public String dashboard() {
        return "nhanvien-dashboard"; // Giao diện quản lý công việc nhân viên
    }
}

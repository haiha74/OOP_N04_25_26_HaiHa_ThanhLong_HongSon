package com.longsonha.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.longsonha.bookstore.model.NhanVien;
import com.longsonha.bookstore.service.NhanVienService;

@Controller
public class AdminController {

    private final NhanVienService nhanVienService;

    public AdminController(NhanVienService nhanVienService) {
        this.nhanVienService = nhanVienService;
    }

    @GetMapping("/admin/login")
    public String login() {
        return "admin-login";
    }

    @GetMapping("/admin/dashboard")
    public String dashboard() {
        return "admin-dashboard";
    }

    @GetMapping("/admin/nhanvien")
    public String listNhanVien(Model model) {
        model.addAttribute("nhanviens", nhanVienService.getAll());
        return "admin-nhanvien-list";
    }

    @GetMapping("/admin/nhanvien/new")
    public String createNhanVienForm(Model model) {
        model.addAttribute("nhanvien", new NhanVien());
        return "admin-nhanvien-form";
    }

}

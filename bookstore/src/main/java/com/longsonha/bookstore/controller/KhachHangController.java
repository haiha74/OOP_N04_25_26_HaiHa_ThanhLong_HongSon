package com.longsonha.bookstore.controller;

import com.longsonha.bookstore.model.KhachHang;
import com.longsonha.bookstore.service.KhachHangService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/khachhang")
public class KhachHangController {
    private final KhachHangService service;

    public KhachHangController(KhachHangService service) {
        this.service = service;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("listKhach", service.getAll());
        return "khachhang-list";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("khach", new KhachHang());
        return "khachhang-form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("khach") KhachHang kh) {
        service.save(kh);
        return "redirect:/khachhang";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("khach", service.findById(id));
        return "khachhang-form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/khachhang";
    }
}

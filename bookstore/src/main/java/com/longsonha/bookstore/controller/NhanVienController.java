package com.longsonha.bookstore.controller;

import com.longsonha.bookstore.model.NhanVien;
import com.longsonha.bookstore.service.NhanVienService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/nhanvien")
public class NhanVienController {

    private final NhanVienService service;

    public NhanVienController(NhanVienService service) {
        this.service = service;
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("listNhanVien", service.getAll());
        return "nhanvien-list";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("nhanvien", new NhanVien());
        return "nhanvien-form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute NhanVien nv) {
        service.save(nv);
        return "redirect:/admin/nhanvien";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("nhanvien", service.findById(id));
        return "admin-nhanvien-form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/admin/nhanvien";
    }
}

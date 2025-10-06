package com.longsonha.bookstore.controller;

import com.longsonha.bookstore.model.Sach;
import com.longsonha.bookstore.service.SachService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sach")
public class SachController {
    private final SachService service;

    public SachController(SachService service) {
        this.service = service;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("listSach", service.getAll());
        return "sach-list";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("sach", new Sach());
        return "sach-form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("sach") Sach sach) {
        service.save(sach);
        return "redirect:/sach";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("sach", service.findById(id));
        return "sach-form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/sach";
    }
}

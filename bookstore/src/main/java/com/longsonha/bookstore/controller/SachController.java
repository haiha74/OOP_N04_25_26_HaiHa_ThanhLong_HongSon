package com.longsonha.bookstore.controller;

import com.longsonha.bookstore.model.Sach;
import com.longsonha.bookstore.service.SachService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/sach")
public class SachController {
    private final SachService service;

    public SachController(SachService service) {
        this.service = service;
    }

    // 🟢 Danh sách sách + tìm kiếm theo tên
    @GetMapping
    public String list(@RequestParam(value = "keyword", required = false) String keyword, Model model) {
        List<Sach> listSach;
        if (keyword != null && !keyword.trim().isEmpty()) {
            listSach = service.searchByName(keyword);
            model.addAttribute("keyword", keyword);
        } else {
            listSach = service.getAll();
        }
        model.addAttribute("listSach", listSach);
        return "sach-list";
    }

    //Thêm sách
    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("sach", new Sach());
        return "sach-form";
    }

    //Lưu (thêm/sửa)
    @PostMapping("/save")
    public String save(@ModelAttribute("sach") Sach sach) {
        service.save(sach);
        return "redirect:/sach";
    }

    //Form sửa
    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("sach", service.findById(id));
        return "sach-form";
    }

    //Xóa sách
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/sach";
    }
}

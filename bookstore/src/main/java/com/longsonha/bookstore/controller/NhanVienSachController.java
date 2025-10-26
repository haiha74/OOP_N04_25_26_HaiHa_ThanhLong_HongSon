package com.longsonha.bookstore.controller;

import com.longsonha.bookstore.model.Sach;
import com.longsonha.bookstore.service.SachService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/nhanvien/sach")
public class NhanVienSachController {

    private final SachService sachService;

    public NhanVienSachController(SachService sachService) {
        this.sachService = sachService;
    }

    //Danh sách sách
    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("books", sachService.getAll());
        return "nhanvien-sach-list";
    }


    //Thêm sách mới
    @GetMapping("/new")
    public String newBook(Model model) {
        model.addAttribute("book", new Sach());
        return "nhanvien-sach-form";
    }

    //Lưu sách
    @PostMapping("/save")
    public String saveBook(@ModelAttribute("book") Sach book) {
        sachService.save(book);
        return "redirect:/nhanvien/sach/list";
    }

    //Form sửa sách
    @GetMapping("/edit/{id}")
    public String editBook(@PathVariable Long id, Model model) {
        model.addAttribute("book", sachService.findById(id));
        return "nhanvien-sach-form";
    }

    // Xóa sách
    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        sachService.delete(id);
        return "redirect:/nhanvien/sach/list";
    }
}

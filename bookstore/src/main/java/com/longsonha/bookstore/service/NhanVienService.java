package com.longsonha.bookstore.service;

import com.longsonha.bookstore.model.NhanVien;
import com.longsonha.bookstore.repository.NhanVienRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienService {
    private final NhanVienRepository repo;

    public NhanVienService(NhanVienRepository repo) {
        this.repo = repo;
    }

    public List<NhanVien> getAll() { return repo.findAll(); }
    public NhanVien save(NhanVien nv) { return repo.save(nv); }
    public void delete(Long id) { repo.deleteById(id); }
    public NhanVien findById(Long id) { return repo.findById(id).orElse(null); }
}

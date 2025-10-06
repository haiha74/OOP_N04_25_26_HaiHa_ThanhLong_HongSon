package com.longsonha.bookstore.service;

import com.longsonha.bookstore.model.KhachHang;
import com.longsonha.bookstore.repository.KhachHangRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class KhachHangService {
    private final KhachHangRepository repo;

    public KhachHangService(KhachHangRepository repo) {
        this.repo = repo;
    }

    public List<KhachHang> getAll() { return repo.findAll(); }
    public KhachHang save(KhachHang kh) { return repo.save(kh); }
    public void delete(Long id) { repo.deleteById(id); }
    public KhachHang findById(Long id) { return repo.findById(id).orElse(null); }
}

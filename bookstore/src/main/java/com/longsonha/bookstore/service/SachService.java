package com.longsonha.bookstore.service;

import com.longsonha.bookstore.model.Sach;
import com.longsonha.bookstore.repository.SachRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SachService {
    private final SachRepository repo;

    public SachService(SachRepository repo) {
        this.repo = repo;
    }

    public List<Sach> getAll() {
        return repo.findAll();
    }

    public Sach save(Sach sach) {
        return repo.save(sach);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Sach findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public List<Sach> searchByName(String tenSach) {
        return repo.findByTenSachContainingIgnoreCase(tenSach);
    }
}

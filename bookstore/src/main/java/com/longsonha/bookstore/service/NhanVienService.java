package com.longsonha.bookstore.service;

import com.longsonha.bookstore.model.NhanVien;
import com.longsonha.bookstore.repository.NhanVienRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NhanVienService {
    private final NhanVienRepository repo;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public NhanVienService(NhanVienRepository repo) {
        this.repo = repo;
    }

    public List<NhanVien> getAll() {
        return repo.findAll();
    }

    public NhanVien save(NhanVien nv) {
        if (!nv.getPassword().startsWith("$2a$")) {
            nv.setPassword(encoder.encode(nv.getPassword()));
        }
        return repo.save(nv);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public NhanVien findById(Long id) {
        return repo.findById(id).orElse(null);
    }
}

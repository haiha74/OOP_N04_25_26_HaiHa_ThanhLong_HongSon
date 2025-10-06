package com.longsonha.bookstore.service;

import com.longsonha.bookstore.model.Admin;
import com.longsonha.bookstore.repository.AdminRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdminService {
    private final AdminRepository repo;

    public AdminService(AdminRepository repo) {
        this.repo = repo;
    }

    public List<Admin> getAll() { return repo.findAll(); }

    public Admin findByUsername(String username) {
        return repo.findByUsername(username);
    }

    public void save(Admin admin) {
        repo.save(admin);
    }
}

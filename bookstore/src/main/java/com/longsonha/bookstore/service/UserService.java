package com.longsonha.bookstore.service;

import com.longsonha.bookstore.model.User;
import com.longsonha.bookstore.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<User> getAll() {
        return repo.findAll();
    }

    public User save(User user) {
        return repo.save(user);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public User findById(Long id) {
        return repo.findById(id).orElse(null);
    }
}

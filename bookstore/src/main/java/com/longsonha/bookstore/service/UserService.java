package com.longsonha.bookstore.service;

import com.longsonha.bookstore.model.User;
import com.longsonha.bookstore.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    private final UserRepository repo;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    //  Lấy toàn bộ người dùng
    public List<User> getAll() {
        return repo.findAll();
    }

    //  Thêm hoặc cập nhật người dùng
    public User save(User user) {
        // Nếu mật khẩu chưa được mã hóa, ta mã hóa trước khi lưu
        if (!user.getPassword().startsWith("$2a$")) {
            user.setPassword(encoder.encode(user.getPassword()));
        }

        // Nếu chưa có vai trò, mặc định là USER
        if (user.getRole() == null || user.getRole().isBlank()) {
            user.setRole("USER");
        }

        return repo.save(user);
    }

    //  Xóa người dùng
    public void delete(Long id) {
        repo.deleteById(id);
    }

    //  Tìm theo ID
    public User findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    //  Tìm theo tên đăng nhập (dùng cho login)
    public User findByUsername(String username) {
        return repo.findByUsername(username);
    }
}

package com.longsonha.bookstore.service;

import com.longsonha.bookstore.model.Admin;
import com.longsonha.bookstore.model.NhanVien;
import com.longsonha.bookstore.model.User;
import com.longsonha.bookstore.repository.AdminRepository;
import com.longsonha.bookstore.repository.NhanVienRepository;
import com.longsonha.bookstore.repository.UserRepository;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final AdminRepository adminRepo;
    private final NhanVienRepository nvRepo;
    private final UserRepository userRepo;

    public CustomUserDetailsService(AdminRepository adminRepo, NhanVienRepository nvRepo, UserRepository userRepo) {
        this.adminRepo = adminRepo;
        this.nvRepo = nvRepo;
        this.userRepo = userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Admin admin = adminRepo.findByUsername(username);
        if (admin != null) {
            return org.springframework.security.core.userdetails.User
                    .withUsername(admin.getUsername())
                    .password(admin.getPassword())
                    .roles("ADMIN")
                    .build();
        }

        NhanVien nv = nvRepo.findByUsername(username);
        if (nv != null) {
            return org.springframework.security.core.userdetails.User
                    .withUsername(nv.getUsername())
                    .password(nv.getPassword())
                    .roles("EMPLOYEE")
                    .build();
        }

        User u = userRepo.findByUsername(username);
        if (u != null) {
            return org.springframework.security.core.userdetails.User
                    .withUsername(u.getUsername())
                    .password(u.getPassword())
                    .roles("USER")
                    .build();
        }

        throw new UsernameNotFoundException("Không tìm thấy tài khoản: " + username);
    }
}

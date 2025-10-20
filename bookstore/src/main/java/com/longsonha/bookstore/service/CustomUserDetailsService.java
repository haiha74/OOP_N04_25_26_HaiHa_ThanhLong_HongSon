package com.longsonha.bookstore.service;

import com.longsonha.bookstore.model.Admin;
import com.longsonha.bookstore.model.NhanVien;
import com.longsonha.bookstore.repository.AdminRepository;
import com.longsonha.bookstore.repository.NhanVienRepository;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final AdminRepository adminRepo;
    private final NhanVienRepository nvRepo;

    public CustomUserDetailsService(AdminRepository adminRepo, NhanVienRepository nvRepo) {
        this.adminRepo = adminRepo;
        this.nvRepo = nvRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //Kiểm tra admin
        Admin admin = adminRepo.findByUsername(username);
        if (admin != null) {
            return org.springframework.security.core.userdetails.User
                    .withUsername(admin.getUsername())
                    .password(admin.getPassword())
                    .roles("ADMIN")
                    .build();
        }

        //Kiểm tra nhân viên
        NhanVien nv = nvRepo.findByUsername(username);
        if (nv != null) {
            return org.springframework.security.core.userdetails.User
                    .withUsername(nv.getUsername())
                    .password(nv.getPassword())
                    .roles("EMPLOYEE")
                    .build();
        }

        // Nếu không tìm thấy
        throw new UsernameNotFoundException("Tài khoản không tồn tại: " + username);
    }
}

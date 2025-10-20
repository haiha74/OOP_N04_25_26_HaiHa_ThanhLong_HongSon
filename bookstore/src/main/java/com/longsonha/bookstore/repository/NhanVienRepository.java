package com.longsonha.bookstore.repository;

import com.longsonha.bookstore.model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NhanVienRepository extends JpaRepository<NhanVien, Long> {
    NhanVien findByUsername(String username);
}


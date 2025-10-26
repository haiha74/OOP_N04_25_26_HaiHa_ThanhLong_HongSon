package com.longsonha.bookstore.repository;

import com.longsonha.bookstore.model.Sach;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

    public interface SachRepository extends JpaRepository<Sach, Long> {
        List<Sach> findByTenSachContainingIgnoreCase(String tenSach);
    }



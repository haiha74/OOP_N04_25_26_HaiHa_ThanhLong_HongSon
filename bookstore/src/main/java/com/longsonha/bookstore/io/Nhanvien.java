package com.longsonha.bookstore.io;
import java.io.Serializable;

public class Nhanvien implements Serializable {
    private static final long serialVersionUID = 1L;
    private String maNV;
    private String tenNV;
    private String chucVu;

    public Nhanvien(String maNV, String tenNV, String chucVu) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.chucVu = chucVu;
    }

    @Override
    public String toString() {
        return String.format("NhanVien{maNV='%s', tenNV='%s', chucVu='%s'}", maNV, tenNV, chucVu);
    }
}

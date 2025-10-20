package com.longsonha.bookstore.io;
import java.io.*;
import java.util.*;

public class WriteData {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("B01", "Java Programming", 89.5),
                new Book("B02", "Spring Boot Essentials", 105.0)
        );
        List<Admin> admins = Arrays.asList(
                new Admin("admin", "admin123"),
                new Admin("root", "123456")
        );
        List<Nhanvien> Nhanviens = Arrays.asList(
                new Nhanvien("NV01", "Nguyen Hai Ha", "Quan Li"),
                new Nhanvien("NV02", "Vu Thanh Long", "Ban Hang")
        );

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.dat"))) {
            oos.writeObject(books);
            oos.writeObject(admins);
            oos.writeObject(Nhanviens);
            System.out.println("Da ghi du lieu ra file data.dat!");
        } catch (IOException e) {
            System.out.println("Loi ghi file: " + e.getMessage());
        }
    }
}

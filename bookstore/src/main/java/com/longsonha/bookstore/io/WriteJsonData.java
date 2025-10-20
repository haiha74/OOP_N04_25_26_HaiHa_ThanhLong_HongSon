package com.longsonha.bookstore.io;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WriteJsonData {
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

        Map<String, Object> data = new LinkedHashMap<>();
        data.put("books", books);
        data.put("admins", admins);
        data.put("Nhanviens", Nhanviens);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter("data.json")) {
            gson.toJson(data, writer);
            System.out.println("Da ghi du lieu ra file data.json!");
        } catch (IOException e) {
            System.out.println("Loi ghi JSON: " + e.getMessage());
        }
    }
}


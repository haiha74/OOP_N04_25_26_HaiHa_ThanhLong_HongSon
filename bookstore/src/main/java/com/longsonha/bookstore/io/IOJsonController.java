package com.longsonha.bookstore.io;

import org.springframework.web.bind.annotation.*;
import com.google.gson.*;
import java.io.*;
import java.util.*;

@RestController
@RequestMapping("/io")
public class IOJsonController {

    @GetMapping("/write-json")
    public String writeJson() {
        // Demo
        List<Book> books = Arrays.asList(
                new Book("B01", "Java Programming", 89.5),
                new Book("B02", "Spring Boot Essentials", 105.0)
        );
        List<Admin> admins = Arrays.asList(
                new Admin("admin", "admin123"),
                new Admin("root", "123456")
        );
        List<Nhanvien> Nhanviens = Arrays.asList(
                new Nhanvien("NV01", "Nguyen Van A", "Thu ngân"),
                new Nhanvien("NV02", "Tran Thi B", "Bán hàng")
        );


        Map<String, Object> data = new LinkedHashMap<>();
        data.put("books", books);
        data.put("admins", admins);
        data.put("Nhanviens", Nhanviens);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("data.json")) {
            gson.toJson(data, writer);
            return "Ghi file data.json thành công!";
        } catch (IOException e) {
            return "Lỗi ghi JSON: " + e.getMessage();
        }
    }


    @GetMapping("/read-json")
    public String readJson() {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader("data.json")) {
            Map<String, Object> data = gson.fromJson(reader, Map.class);

            StringBuilder result = new StringBuilder();
            result.append("BOOKS:\n");
            result.append(data.get("books")).append("\n\n");

            result.append("ADMINS:\n");
            result.append(data.get("admins")).append("\n\n");

            result.append("NHÂN VIÊN:\n");
            result.append(data.get("Nhanviens")).append("\n");

            return result.toString();
        } catch (IOException e) {
            return "Lỗi đọc JSON: " + e.getMessage();
        }
    }
}

package com.longsonha.bookstore.io;

import org.springframework.web.bind.annotation.*;
import java.io.*;
import java.util.*;


@RestController
@RequestMapping("/io")
public class IOController {


    @GetMapping("/write")
    public String writeData() {
        // demo
        List<Book> books = Arrays.asList(
                new Book("B01", "Java Programming", 89.5),
                new Book("B02", "Spring Boot Essentials", 105.0)
        );
        List<Admin> admins = Arrays.asList(
                new Admin("admin", "admin123"),
                new Admin("root", "123456")
        );
        List<Nhanvien> Nhanviens = Arrays.asList(
                new Nhanvien("NV01", "Nguyen Hai Ha", "Thu ngân"),
                new Nhanvien("NV02", "Long", "Bán hàng")
        );

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.dat"))) {
            oos.writeObject(books);
            oos.writeObject(admins);
            oos.writeObject(Nhanviens);
        } catch (IOException e) {
            return " Lỗi ghi file: " + e.getMessage();
        }

        return " Ghi file data.dat thành công!";
    }

    @GetMapping("/read")
    public String readData() {
        StringBuilder result = new StringBuilder();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.dat"))) {
            List<Book> books = (List<Book>) ois.readObject();
            List<Admin> admins = (List<Admin>) ois.readObject();
            List<Nhanvien> Nhanviens = (List<Nhanvien>) ois.readObject();

            result.append(" BOOK LIST:\n");
            for (Book b : books) result.append(b).append("\n");

            result.append("\n ADMIN LIST:\n");
            for (Admin a : admins) result.append(a).append("\n");

            result.append("\n NHÂN VIÊN LIST:\n");
            for (Nhanvien nv : Nhanviens) result.append(nv).append("\n");

        } catch (IOException | ClassNotFoundException e) {
            return "Lỗi đọc file: " + e.getMessage();
        }

        return result.toString();
    }
}

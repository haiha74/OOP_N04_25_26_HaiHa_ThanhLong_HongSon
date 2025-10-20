package com.longsonha.bookstore.io;
import java.io.*;
import java.util.*;

public class ReadData {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.dat"))) {
            List<Book> books = (List<Book>) ois.readObject();
            List<Admin> admins = (List<Admin>) ois.readObject();
            List<Nhanvien> Nhanviens = (List<Nhanvien>) ois.readObject();

            System.out.println("BOOK LIST:");
            books.forEach(System.out::println);

            System.out.println("\nADMIN LIST:");
            admins.forEach(System.out::println);

            System.out.println("\nNHÂN VIÊN LIST:");
            Nhanviens.forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Loi đọc file: " + e.getMessage());
        }
    }
}


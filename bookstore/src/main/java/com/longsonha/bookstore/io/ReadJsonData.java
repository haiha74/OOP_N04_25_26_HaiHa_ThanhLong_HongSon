package com.longsonha.bookstore.io;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class ReadJsonData {
    public static void main(String[] args) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader("data.json")) {
            Map data = gson.fromJson(reader, Map.class);
            System.out.println("Du lieu trong file JSON:");
            System.out.println(data);
        } catch (IOException e) {
            System.out.println("Loi đọc JSON: " + e.getMessage());
        }
    }
}

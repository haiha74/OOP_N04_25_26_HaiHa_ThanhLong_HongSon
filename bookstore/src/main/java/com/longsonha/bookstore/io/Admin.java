package com.longsonha.bookstore.io;
import java.io.Serializable;

public class Admin implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("Admin{username='%s', password='%s'}", username, password);
    }
}

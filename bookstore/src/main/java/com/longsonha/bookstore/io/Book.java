package com.longsonha.bookstore.io;
import java.io.Serializable;

public class Book implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String title;
    private double price;

    public Book(String id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Book{id='%s', title='%s', price=%.2f}", id, title, price);
    }
}

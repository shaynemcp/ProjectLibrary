package models;

import java.util.Objects;

public class book {
    private int id;
    private String title;
    private float price;

    public book() {
    }

    public book(int id, String title, float price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    //Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // Equals & Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        book book = (book) o;
        return id == book.id && Float.compare(book.price, price) == 0 && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, price);
    }
}

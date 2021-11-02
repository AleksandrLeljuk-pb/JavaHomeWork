package com.pb.lelyuk.hw5;

public class Book {
    private String title;
    private String author;
    private int publicYear;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicYear() {
        return publicYear;
    }

    public void setPublicYear(int publicYear) {
        this.publicYear = publicYear;
    }

    String getInfoBook() {
        return "[назва книги: " + title + ", автор: " + author
                + ", рік видання: " + publicYear + "]";
    }
}

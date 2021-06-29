package com.proj.readerslibrary.entity;

public class Book {

    private int BookId;
    private String name;
    private String author;
    private int pages;
    private int publishYear;
    private String category;

    public int getBookId() {
        return this.BookId;
    }

    public void setBookId(int BookId) {
        this.BookId = BookId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

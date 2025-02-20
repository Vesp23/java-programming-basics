package org.javaguru.kraed.lesson3;

public class Book {
    private String name;
    private int year;
    private String author;
    private Chapter chapter1;
    private Chapter chapter2;

    public Book(String name, int year, String author, Chapter chapter1, Chapter chapter2) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.chapter1 = chapter1;
        this.chapter2 = chapter2;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Chapter getChapter1() {
        return chapter1;
    }

    public String getAuthor() {
        return author;
    }

    public Chapter getChapter2() {
        return chapter2;
    }
}

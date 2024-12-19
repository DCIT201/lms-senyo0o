package org.example;

public class Book {
    // Attributes
    private String title;
    private String author;
    private long ISBN; // Changed to long

    // Constructor
    public Book(String title, String author, long ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public long getISBN() { // Return long
        return ISBN;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(long ISBN) { // Accept long
        this.ISBN = ISBN;
    }

    // Display book details
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN);
    }
}

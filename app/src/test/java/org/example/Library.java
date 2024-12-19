package org.example;


import java.util.ArrayList;


public class Library {
    // Attributes
    private ArrayList<Book> books;
    private ArrayList<Patron> patrons;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Remove a book
    public void removeBook(long ISBN) {
        books.removeIf(book -> book.getISBN() == ISBN);
        System.out.println("Book with ISBN " + ISBN + " removed.");
    }

    // Register a patron
    public void registerPatron(Patron patron) {
        patrons.add(patron);
        System.out.println("Patron registered: " + patron.getName());
    }

    // Display all books
    public void displayBooks() {
        for (Book book : books) {
            book.displayBook();
        }
    }

    // Display all patrons
    public void displayPatrons() {
        for (Patron patron : patrons) {
            patron.displayPatron();
        }
    }
}

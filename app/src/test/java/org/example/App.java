package org.example;


public class App {
    public static void main(String[] args) {
        // Create a Library object
        Library library = getLibrary();

        // Display books and patrons
        System.out.println("\n--- List of Books ---");
        library.displayBooks();

        System.out.println("\n--- List of Patrons ---");
        library.displayPatrons();

        // Remove a book and display updated list
        library.removeBook(123456L); // Pass ISBN as a long with 'L'
        System.out.println("\n--- Updated List of Books ---");
        library.displayBooks();

    }

    private static Library getLibrary() {
        Library library = new Library();

        // Create Book objects
        Book book1 = new Book("The Four Agreement", "Miguel Don Ruiz", 9781878424310L);

        Book book2 = new Book("The Alchemist", "Paulo Coelho", 9781878424310L);


        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);

        // Create Patron objects
        Patron patron1 = new Patron("Senyo Senaya", 1);
        Patron patron2 = new Patron("Cole Palmer", 2);

        // Register patrons
        library.registerPatron(patron1);
        library.registerPatron(patron2);
        return library;
    }
}

package Part4;

// Part 4 The Final Blueprint Project
// Controller Class: Main

public class Main {

    public static void main(String[] args) {

        // Create two libraries
        Library library1 = new Library();
        Library library2 = new Library();

        // Create five books
        Book book1 = new Book("ISBN001", "Java Basics");
        Book book2 = new Book("ISBN002", "Python Basics");
        Book book3 = new Book("ISBN003", "Data Structures");
        Book book4 = new Book("ISBN004", "Algorithms");
        Book book5 = new Book("ISBN005", "Computer Science");

        // Add three books to the first library
        library1.addBooks(book1, book2, book3);

        // Add two books to the second library
        library2.addBooks(book4, book5);

        // Print the shared global total
        System.out.println("Part 4: Total books = " + Library.getTotalBooks());
    }
}

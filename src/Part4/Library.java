package Part4;

// Part 4 The Final Blueprint Project
// Class Library
public class Library {

    private static int totalBooks = 0;

    private Book[] collection;

    public Library() {
        collection = new Book[0];
    }

    // Add multiple books using Varargs
    public void addBooks(Book... newBooks) {

        Book[] updatedCollection = new Book[collection.length + newBooks.length];

        for (int i = 0; i < collection.length; i++) {
            updatedCollection[i] = collection[i];
        }

        for (int i = 0; i < newBooks.length; i++) {
            updatedCollection[collection.length + i] = newBooks[i];
        }

        collection = updatedCollection;

        totalBooks = totalBooks + newBooks.length;
    }

    // Get total books in all libraries
    public static int getTotalBooks() {
        return totalBooks;
    }
}

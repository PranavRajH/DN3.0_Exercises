package Exercise6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LibraryManagementSystem {
    private List<Book> books;

    public LibraryManagementSystem() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        Collections.sort(books, Comparator.comparing(Book::getTitle));
    }

    public Book binarySearchByTitle(String title) {
        int left = 0, right = books.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books.get(mid).getTitle().compareToIgnoreCase(title);
            if (comparison == 0) {
                return books.get(mid);
            }
            if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    // Method for testing
    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        lms.addBook(new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"));
        lms.addBook(new Book("B002", "To Kill a Mockingbird", "Harper Lee"));
        lms.addBook(new Book("B003", "1984", "George Orwell"));

        System.out.println("Binary Search for '1984':");
        Book book = lms.binarySearchByTitle("1984");
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book not found.");
        }
    }
}
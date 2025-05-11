import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void showAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable) {
                System.out.println(book.getTitle() + " " + book.getAuthor());
            }
        }
    }

    public void borrowBook(String _book) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(_book)) {
                found = true;
                if (book.isAvailable()) {
                    book.borrow();
                    System.out.println("You borrowed " + _book);
                } else {
                    System.out.println("Book is already borrowed.");
                }
                return;
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }
    }



    public void returnBook(String _book) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(_book)) {
                book.returnBook();
                System.out.println("You returned " + _book);
            }
        }
    }
}

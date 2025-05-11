import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lb = new Library();
        lb.addBook(new Book("1984", "George Orwell"));
        lb.addBook(new Book("Clean Code", "Robert S. Martin"));
        lb.addBook(new Book("Java", "Ali Huseynov"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n📖 Library Menu:");
        System.out.println("1. Show available books");
        System.out.println("2. Borrow a book");
        System.out.println("3. Return a book");
        System.out.println("4. Exit");

        while (true) {
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    lb.showAvailableBooks();
                    break;
                case 2:
                    System.out.println("Enter the title.");
                    String bookTitle = scanner.nextLine();
                    lb.borrowBook(bookTitle);
                    break;
                case 3:
                    System.out.println("Enter the title.");
                    lb.returnBook(scanner.nextLine());
                    break;
                case 4:
                    System.out.println("Good bye.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }

        }
    }
}

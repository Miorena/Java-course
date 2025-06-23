import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for book's deatils
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter year published: ");
        int yearPublished = scanner.nextInt();

        Book book = new Book(title, author, yearPublished);
        book.displayDetails();

        scanner.close();
    }
}

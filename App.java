import java.util.Scanner;

public class App {
    public static Book promptBookDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter year published: ");
        int yearPublished = scanner.nextInt();

        scanner.close();
        return new Book(title, author, yearPublished);
    }
    public static void main(String[] args) {
        Book book = promptBookDetails();
        book.displayDetails();
    }
}
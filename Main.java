import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter average: ");
        double average = scanner.nextDouble();

        Student student = new Student(name, age, average);

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Average: " + student.getAverage());
        System.out.println("-----------------------");

        scanner.close();
    }
}
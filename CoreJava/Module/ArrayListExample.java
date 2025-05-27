
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();

        System.out.print("How many student names do you want to add? ");
        int count = scanner.nextInt();
        scanner.nextLine();  // consume that leftover newline

        for (int i = 0; i < count; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            studentNames.add(name);
        }

        System.out.println("\n📋 List of Students:");
        for (String name : studentNames) {
            System.out.println("- " + name);
        }

        scanner.close();
    }
}

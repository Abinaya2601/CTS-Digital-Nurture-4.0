import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> studentMap = new HashMap<>();

        System.out.print("How many students do you want to add? ");
        int count = scanner.nextInt();
        scanner.nextLine();  // flush newline

        // Adding entries
        for (int i = 0; i < count; i++) {
            System.out.print("Enter student ID (number): ");
            int id = scanner.nextInt();
            scanner.nextLine(); // flush again

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            studentMap.put(id, name);
        }

        // Retrieve based on ID
        System.out.print("\nEnter a student ID to search: ");
        int searchId = scanner.nextInt();

        if (studentMap.containsKey(searchId)) {
            System.out.println("Student name: " + studentMap.get(searchId));
        } else {
            System.out.println("⚠️ No student found with ID: " + searchId);
        }

        scanner.close();
    }
}

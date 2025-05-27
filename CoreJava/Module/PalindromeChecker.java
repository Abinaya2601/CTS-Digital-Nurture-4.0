import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Clean the string: remove non-alphanumeric & lowercase everything
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the cleaned string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Check palindrome
        if (cleaned.equals(reversed)) {
            System.out.println("\"" + input + "\" is a palindrome! 🪞✨");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome. Keep trying! 😅");
        }

        scanner.close();
    }
}


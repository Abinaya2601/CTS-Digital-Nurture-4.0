import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a non-negative integer
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        // Validate input
        if (number < 0) {
            System.out.println("Bruh, factorial doesn’t exist for negative numbers. Try again!");
        } else {
            long factorial = 1;  // use long cuz factorials get big real quick

            // Calculate factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println(number + "! = " + factorial);
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class RecursiveFibonacci {
    
    // Recursive method to calculate nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;  // base case
        } else if (n == 1) {
            return 1;  // base case
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);  // recursive call
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Yo, enter a positive number only! No negatives allowed.");
        } else {
            int result = fibonacci(n);
            System.out.println("Fibonacci number at position " + n + " is " + result);
        }

        scanner.close();
    }
}

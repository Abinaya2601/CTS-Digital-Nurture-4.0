
import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Come on, enter a positive number of elements!");
            scanner.close();
            return;
        }

        int[] numbers = new int[n];

        // Step 2: Read elements into the array
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Step 3: Calculate sum
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // Step 4: Calculate average
        double average = (double) sum / n;

        // Step 5: Display results
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        scanner.close();
    }
}

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();

        // Loop from 1 to 10 and print the table
        System.out.println("Multiplication Table for " + number + ":");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }

        scanner.close();
    }
}

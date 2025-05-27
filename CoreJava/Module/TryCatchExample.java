import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator (integer): ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the denominator (integer): ");
        int denominator = scanner.nextInt();

        try {
            int result = numerator / denominator;  // risky business here
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Whoa! You can’t divide by zero. Chill with that denominator! 🚫0");
        }

        scanner.close();
    }
}

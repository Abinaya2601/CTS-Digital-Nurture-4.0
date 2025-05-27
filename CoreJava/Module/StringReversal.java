import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the string from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Using StringBuilder to reverse the string
        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();  // built-in method that does the trick

        System.out.println("Reversed string: " + reversed.toString());

        scanner.close();
    }
}

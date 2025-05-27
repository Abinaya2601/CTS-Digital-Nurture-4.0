import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to write to the file: ");
        String userInput = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(userInput);
            writer.close();  // don’t forget to close the writer
            System.out.println(" Data written to output.txt successfully!");
        } catch (IOException e) {
            System.out.println(" Error writing to file: " + e.getMessage());
        }

        scanner.close();
    }
}

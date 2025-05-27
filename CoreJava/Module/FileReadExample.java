import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadExample {
    public static void main(String[] args) {
        try {
            File file = new File("output.txt");
            Scanner reader = new Scanner(file);

            System.out.println("📄 Contents of output.txt:");

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("❌ File not found! Make sure output.txt exists.");
        }
    }
}

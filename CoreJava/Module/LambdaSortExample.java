import java.util.*;

public class LambdaSortExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Zoya");
        names.add("Arun");
        names.add("Kriti");
        names.add("Bhavya");

        System.out.println("📋 Original List: " + names);

        // Sorting using lambda expression
        Collections.sort(names, (a, b) -> a.compareToIgnoreCase(b));

        System.out.println("✅ Sorted List: " + names);
    }
}

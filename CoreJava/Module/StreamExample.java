import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 7, 24, 9, 18, 3, 10);

        System.out.println("🔢 Original list: " + numbers);

        // Stream to filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());

        System.out.println("✅ Even numbers: " + evenNumbers);
    }
}

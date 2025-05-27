import java.util.*;
import java.util.stream.Collectors;

// Record definition (immutable, compact, clean)
record Person(String name, int age) {}

public class RecordExample {
    public static void main(String[] args) {
        // Creating record instances
        Person p1 = new Person("Arjun", 22);
        Person p2 = new Person("Meera", 17);
        Person p3 = new Person("Vikram", 30);

        List<Person> people = List.of(p1, p2, p3);

        System.out.println("👥 All people:");
        people.forEach(System.out::println);

        // Filter only adults (age 18+)
        List<Person> adults = people.stream()
                                    .filter(person -> person.age() >= 18)
                                    .collect(Collectors.toList());

        System.out.println("\n🧑 Adults (age >= 18):");
        adults.forEach(System.out::println);
    }
}

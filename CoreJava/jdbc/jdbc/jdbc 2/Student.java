public class Student {
    private int id;
    private String name;
    private int age;

    // Constructor for insert (id auto-generated maybe)
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor for update (needs id)
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters & setters (or use Lombok if you want)
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
}

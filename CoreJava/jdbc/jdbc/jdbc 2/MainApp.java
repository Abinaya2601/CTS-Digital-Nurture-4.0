import java.sql.Connection;
import java.sql.DriverManager;

public class MainApp {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:students.db";

        try (Connection conn = DriverManager.getConnection(url)) {
            StudentDAO dao = new StudentDAO(conn);

            // Insert a new student
            Student newStudent = new Student("Nina", 21);
            if (dao.insertStudent(newStudent)) {
                System.out.println("Student inserted successfully!");
            }

            // Update an existing student (assuming ID 1 exists)
            Student updatedStudent = new Student(1, "Akshu Updated", 23);
            if (dao.updateStudent(updatedStudent)) {
                System.out.println("Student updated successfully!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

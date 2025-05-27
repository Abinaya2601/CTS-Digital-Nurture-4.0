import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcExample {

    public static void main(String[] args) {
        String url = "jdbc:sqlite:students.db";  // SQLite DB file path

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            String sql = "SELECT id, name, age FROM students";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.printf("ID: %d, Name: %s, Age: %d%n", id, name, age);
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {
    private final Connection conn;

    public StudentDAO(Connection conn) {
        this.conn = conn;
    }

    // Insert new student
    public boolean insertStudent(Student student) {
        String sql = "INSERT INTO students (name, age) VALUES (?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, student.getName());
            pstmt.setInt(2, student.getAge());

            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;  // true if inserted
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Update existing student by ID
    public boolean updateStudent(Student student) {
        String sql = "UPDATE students SET name = ?, age = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, student.getName());
            pstmt.setInt(2, student.getAge());
            pstmt.setInt(3, student.getId());

            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;  // true if updated
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}

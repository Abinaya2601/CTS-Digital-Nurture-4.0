package jdbc.jdbc.handling in jdbc;

public import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountTransfer {

    private static final String URL = "jdbc:mysql://localhost:3306/your_db_name";
    private static final String USER = "your_username";
    private static final String PASSWORD = "your_password";

    public static void transferMoney(int fromAccountId, int toAccountId, double amount) {
        Connection conn = null;
        PreparedStatement debitStmt = null;
        PreparedStatement creditStmt = null;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            
            // Turn off auto-commit so we control transaction manually
            conn.setAutoCommit(false);

            // 1. Debit fromAccountId
            String debitSql = "UPDATE accounts SET balance = balance - ? WHERE account_id = ? AND balance >= ?";
            debitStmt = conn.prepareStatement(debitSql);
            debitStmt.setDouble(1, amount);
            debitStmt.setInt(2, fromAccountId);
            debitStmt.setDouble(3, amount);

            int debitRows = debitStmt.executeUpdate();

            if (debitRows == 0) {
                throw new SQLException("Insufficient balance or invalid fromAccountId");
            }

            // 2. Credit toAccountId
            String creditSql = "UPDATE accounts SET balance = balance + ? WHERE account_id = ?";
            creditStmt = conn.prepareStatement(creditSql);
            creditStmt.setDouble(1, amount);
            creditStmt.setInt(2, toAccountId);

            int creditRows = creditStmt.executeUpdate();

            if (creditRows == 0) {
                throw new SQLException("Invalid toAccountId");
            }

            // If both debit and credit succeed, commit the transaction
            conn.commit();
            System.out.println("Transfer successful!");

        } catch (SQLException e) {
            // Something went wrong, rollback the transaction
            try {
                if (conn != null) {
                    conn.rollback();
                    System.out.println("Transaction rolled back due to error: " + e.getMessage());
                }
            } catch (SQLException rollbackEx) {
                System.err.println("Rollback failed: " + rollbackEx.getMessage());
            }
        } finally {
            // Clean up resources
            try {
                if (debitStmt != null) debitStmt.close();
                if (creditStmt != null) creditStmt.close();
                if (conn != null) conn.setAutoCommit(true);  // Reset auto-commit to default
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                System.err.println("Cleanup failed: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        // Example: Transfer $200 from account 1 to account 2
        transferMoney(1, 2, 200.0);
    }
}
 {
    
}

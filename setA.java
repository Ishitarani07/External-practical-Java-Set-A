import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class setA {

    // 1. Database Configuration Parameters
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/employee";
    private static final String JDBC_USER = "root";       
    private static final String JDBC_PASSWORD = "Ishita@07"; 
    
    // SQL Query
    private static final String SELECT_QUERY = "SELECT EmpID, Name, Salary FROM Employee";

    public static void main(String[] args) {
        
        // 2. Initialize JDBC resources to null
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        System.out.println("--- Starting JDBC Employee Data Fetch ---");

        try {
           
            // 3. Establish the Connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            System.out.println("Connection successful.");

            // 4. Create a Statement
            stmt = conn.createStatement();

            // 5. Execute the SELECT query
            rs = stmt.executeQuery(SELECT_QUERY);
            System.out.println("\n--- Employee Records ---");
            System.out.printf("%-6s | %-20s | %-10s%n", "ID", "Name", "Salary");
            System.out.println("----------------------------------------");

            // 6. Process the Result Set
            while (rs.next()) {
             
                int empId = rs.getInt("EmpID");
                String name = rs.getString("Name");
                double salary = rs.getDouble("Salary");
                
            
                System.out.printf("%-6d | %-20s | $%,.2f%n", empId, name, salary);
            }

        } catch (SQLException e) {
  
            System.err.println("JDBC Error: " + e.getMessage());
        } finally {
           
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
                System.out.println("\nDatabase connection closed.");
            } catch (SQLException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}
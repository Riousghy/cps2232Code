import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/onlineShopping";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Ygh20040826";

    public static void main(String[] args) {
        Connection connection = null;
        try {
            // 加载JDBC驱动
            Class.forName("com.mysql.jdbc.Driver");

            // 建立连接
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Database connected");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        } finally {
            // 确保连接被关闭
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
    }
}

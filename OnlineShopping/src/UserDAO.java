import java.sql.*;

public class UserDAO {
    private Connection connection;

    public UserDAO(Connection connection) {
        this.connection = connection;
    }

    public void addUser(User user) {
        try {
            String query = "INSERT INTO User (username, password, email, address, payment_info) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
//            statement.setString(1, user.getUsername());
//            statement.setString(2, user.getPassword());
//            statement.setString(3, user.getEmail());
//            statement.setString(4, user.getAddress());
//            statement.setString(5, user.getPaymentInfo());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 其他操作：获取用户信息、更新用户信息等
}
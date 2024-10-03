import java.sql.*;

public class OrderDAO {
    private Connection connection;

    public OrderDAO(Connection connection) {
        this.connection = connection;
    }

    public void addOrder(Order order) {
        try {
            String query = "INSERT INTO Order (user_id, order_date, order_status, total_amount) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
//            statement.setInt(1, order.getUserId());
//            statement.setDate(2, new java.sql.Date(order.getOrderDate().getTime()));
//            statement.setString(3, order.getOrderStatus());
//            statement.setDouble(4, order.getTotalAmount());
//            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                int orderId = rs.getInt(1);
                // 添加订单详情信息（略）
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 其他操作：获取订单信息、更新订单信息等
}
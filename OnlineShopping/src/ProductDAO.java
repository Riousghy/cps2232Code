import java.sql.*;
import java.util.List;
interface ProductDao {
    void addProduct(Product product);
    Product getProductById(String id);
    List<Product> getAllProducts();
    void updateProduct(Product product);
    void deleteProduct(String id);
}


public class ProductDAO {
    private Connection connection;

    public ProductDAO(Connection connection) {
        this.connection = connection;
    }

    public void addProduct(Product product) {
        try {
            String query = "INSERT INTO Product (name, Category, ID, Manufacturer, ) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, product.getProductName());
            statement.setString(2, product.getProductCategory());
            statement.setString(1, product.getProductID());
            statement.setString(3, product.getManufacturer());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
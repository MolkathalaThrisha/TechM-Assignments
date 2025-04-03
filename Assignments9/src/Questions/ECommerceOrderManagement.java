package Questions;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class ECommerceOrderManagement {
    private static final String URL = "jdbc:mysql://localhost:3306/ecommerce";
    private static final String USER = "root";
    private static final String PASSWORD = "lucky123";

    public static void addOrder(int orderId, String customerName, double amount) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO orders (order_id, customer_name, amount) VALUES (?, ?, ?)");) {
            stmt.setInt(1, orderId);
            stmt.setString(2, customerName);
            stmt.setDouble(3, amount);
            stmt.executeUpdate();
            System.out.println("Order Added: " + orderId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void fetchOrders() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM orders")) {
            while (rs.next()) {
                System.out.println("Order ID: " + rs.getInt("order_id") + ", Customer: " + rs.getString("customer_name") + ", Amount: " + rs.getDouble("amount"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        addOrder(101, "Lakshmi", 250.75);
        addOrder(102, "Devi", 499.99);
        System.out.println("\nFetching Orders:");
        fetchOrders();
    }
}
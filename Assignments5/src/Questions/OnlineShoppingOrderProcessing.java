package Questions;
import java.time.*;
import java.util.*;
import java.util.stream.*;

class Order {
    int id;
    String customer;
    double amount;
    LocalDate orderDate;
    
    public Order(int id, String customer, double amount, LocalDate orderDate) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
        this.orderDate = orderDate;
    }
    
    @Override
    public String toString() {
        return "Order ID: " + id + ", Customer: " + customer + ", Amount: $" + amount + ", Date: " + orderDate;
    }
}

public class OnlineShoppingOrderProcessing {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order(101, "Lakshmi", 250.50, LocalDate.of(2024, 4, 1)),
            new Order(102, "Lucky", 150.75, LocalDate.of(2024, 4, 3)),
            new Order(103, "Devi", 300.20, LocalDate.of(2024, 4, 2))
        );
        
        System.out.println("All Orders:");
        orders.forEach(System.out::println);
        
        Optional<Order> highestOrder = orders.stream()
            .max(Comparator.comparingDouble(o -> o.amount));
        
        System.out.println("\nHighest Order:");
        highestOrder.ifPresent(System.out::println);
        
        System.out.println("\nOrders Placed After April 1, 2024:");
        orders.stream()
            .filter(o -> o.orderDate.isAfter(LocalDate.of(2024, 4, 1)))
            .forEach(System.out::println);
    }
}
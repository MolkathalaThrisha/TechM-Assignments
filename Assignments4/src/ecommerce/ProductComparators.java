package ecommerce;
import java.util.Comparator;

public class ProductComparators {
    public static Comparator<Product> byName() {
        return Comparator.comparing(Product::getName);
    }

    public static Comparator<Product> byPrice() {
        return Comparator.comparingDouble(Product::getPrice);
    }

    public static Comparator<Product> byCategory() {
        return Comparator.comparing(Product::getCategory);
    }
}

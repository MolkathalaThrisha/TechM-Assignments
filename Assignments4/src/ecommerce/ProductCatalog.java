package ecommerce;
import java.util.*;

public class ProductCatalog {
    private final Map<Product, HashSet<String>> catalog;

    public ProductCatalog(Comparator<Product> comparator) {
        this.catalog = new TreeMap<>(comparator);
    }

    public void addProduct(Product product) {
        catalog.putIfAbsent(product, new HashSet<>());
        catalog.get(product).add(product.getCategory());
    }

    public void displayProducts() {
        for (Product product : catalog.keySet()) {
            System.out.println(product);
        }
    }
    public void findProductsByCategory(String category) {
        for (Map.Entry<Product, HashSet<String>> entry : catalog.entrySet()) {
            if (entry.getValue().contains(category)) {
                System.out.println(entry.getKey());
            }
        }
    }
}

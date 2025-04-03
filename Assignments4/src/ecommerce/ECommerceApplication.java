package ecommerce;
public class ECommerceApplication {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog(ProductComparators.byName());
        catalog.addProduct(new Product(1, "Laptop", "Electronics", 999.99));
        catalog.addProduct(new Product(2, "Smartphone", "Electronics", 499.99));
        catalog.addProduct(new Product(3, "Coffee Maker", "Home Appliances", 79.99));
        catalog.addProduct(new Product(4, "Desk Chair", "Furniture", 150.00));

        System.out.println("All Products:");
        catalog.displayProducts();

        System.out.println("\nProducts in Electronics category:");
        catalog.findProductsByCategory("Electronics");
    }
}

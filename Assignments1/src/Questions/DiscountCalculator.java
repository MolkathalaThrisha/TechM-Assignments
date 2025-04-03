package Questions;
import java.util.Scanner;

public class DiscountCalculator {
    public static double calculateDiscount(double totalAmount, boolean isBOGO, int quantity) {
        double discount = 0;
      
        discount += totalAmount * 0.10;
        if (isBOGO && quantity >= 2) {
            discount += (totalAmount / quantity) * (quantity / 2);
        }
        
        if (totalAmount > 500) {
            discount += totalAmount * 0.05; 
        }
        
        return totalAmount - discount;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter total purchase amount: $");
        double totalAmount = scanner.nextDouble();
        
        System.out.print("Is the product eligible for BOGO? (true/false): ");
        boolean isBOGO = scanner.nextBoolean();
        
        System.out.print("Enter quantity of items: ");
        int quantity = scanner.nextInt();
        
        double finalAmount = calculateDiscount(totalAmount, isBOGO, quantity);
        
        System.out.printf("Final amount after discount: $%.2f\n", finalAmount);
        
        scanner.close();
    }
}

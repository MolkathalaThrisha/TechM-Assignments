package Questions;
import java.util.Scanner;

public class ATMWithdrawal {
    private double balance;
    
    public ATMWithdrawal(double initialBalance) {
        this.balance = initialBalance;
    }
    
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Available balance: $" + balance);
        } else if (amount % 10 != 0) {
            System.out.println("ATM only dispenses multiples of 10.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: $" + balance);
        }
    }
    
    public double getBalance() {
        return balance;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATMWithdrawal atm = new ATMWithdrawal(1000.00);
        System.out.print("Enter withdrawal amount: $");
        double amount = scanner.nextDouble();
        
        atm.withdraw(amount);
        
        scanner.close();
    }
}

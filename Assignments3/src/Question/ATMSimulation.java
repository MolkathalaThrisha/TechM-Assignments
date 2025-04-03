package Question;
import java.util.Scanner;

public class ATMSimulation {

    private double balance;

    public ATMSimulation(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        balance -= amount;
        System.out.println("Please collect your cash.");
    }

    public void deposit(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATMSimulation atm = new ATMSimulation(1000); // Initial balance set to 1000

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        System.out.println("Current Balance: $" + atm.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        try {
                            double amount = Double.parseDouble(scanner.nextLine());
                            atm.withdraw(amount);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a numeric value.");
                        } catch (IllegalArgumentException e) {
                            System.out.println("Transaction error: " + e.getMessage());
                        }
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        try {
                            double amount = Double.parseDouble(scanner.nextLine());
                            atm.deposit(amount);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a numeric value.");
                        } catch (IllegalArgumentException e) {
                            System.out.println("Transaction error: " + e.getMessage());
                        }
                        break;
                    case 4:
                        System.out.println("Thank you for using our ATM.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        }
    }
}

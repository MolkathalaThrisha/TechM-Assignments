package Questions;
public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public BankAccount(String accountNumber, String accountHolder) {
        this(accountNumber, accountHolder, 0.0);
    }
    public BankAccount(String accountNumber) {
        this(accountNumber, "Unknown", 0.0);
    }
    public BankAccount() {
        this("000000", "Unknown", 0.0);
    }
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
      
        BankAccount account1 = new BankAccount("123456789", "Alice", 5000.0);
        BankAccount account2 = new BankAccount("987654321", "Bob");
        BankAccount account3 = new BankAccount("555555555");
        BankAccount account4 = new BankAccount();
        account1.displayAccountInfo();
        System.out.println();
        account2.displayAccountInfo();
        System.out.println();
        account3.displayAccountInfo();
        System.out.println();
        account4.displayAccountInfo();
    }
}

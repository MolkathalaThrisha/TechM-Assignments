package Questions;
class PaymentSystem {
    
    public void makePayment(String cardNumber, String expiryDate, double amount) {
        System.out.println("Payment of $" + amount + " made using Credit Card: " + cardNumber);
    }
    
    public void makePayment(String cardNumber, int pin, double amount) {
        System.out.println("Payment of $" + amount + " made using Debit Card: " + cardNumber);
    }
    
    public void makePayment(String upiId, double amount) {
        System.out.println("Payment of $" + amount + " made using UPI ID: " + upiId);
    }
    
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " made using Cash.");
    }
    
    public static void main(String[] args) {
        PaymentSystem payment = new PaymentSystem();
     
        payment.makePayment("1234-5678-9876-5432", "12/25", 150.0);  // Credit Card
        payment.makePayment("4321-8765-6789-1234", 1234, 200.0);  // Debit Card
        payment.makePayment("user@upi", 300.0);  // UPI
        payment.makePayment(100.0);  // Cash
    }
}

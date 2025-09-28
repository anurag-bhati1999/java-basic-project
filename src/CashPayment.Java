public class CashPayment implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Processing via cashpayment for amount " + amount);
    }
}
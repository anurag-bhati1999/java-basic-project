public class CashPayment implements PaymentStrategy {
    public boolean processPayment(double amount) {
        System.out.println("Processing via cashpayment for amount " + amount);
        return true;
    }
}
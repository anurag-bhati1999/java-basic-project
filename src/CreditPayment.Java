public class CreditPayment implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Processing via credita for amount " + amount);
    }
}


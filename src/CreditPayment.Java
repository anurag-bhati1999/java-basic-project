public class CreditPayment implements PaymentStrategy {
    public boolean processPayment(double amount) {
        System.out.println("Processing via credita for amount " + amount);
        return true;
    }
}


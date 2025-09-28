public class Payment {
    private double amount;
    private PaymentStrategy paymentStrategy;
    
    public Payment(double amount, PaymentStrategy paymentStrategy) {
        this.amount = amount;
        this.paymentStrategy = paymentStrategy;
    }
    
    public boolean processPayment() {
        return paymentStrategy.processPayment(amount);
    }
}
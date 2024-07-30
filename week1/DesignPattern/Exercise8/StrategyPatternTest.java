package week1.DesignPattern.Exercise8;

public class StrategyPatternTest {
    public static void main(String[] args) {
        // Create a CreditCardPayment strategy
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9876-5432", "John Doe");

        // Create a PayPalPayment strategy
        PaymentStrategy paypal = new PayPalPayment("john.doe@example.com");

        // Create PaymentContext with CreditCardPayment strategy and execute payment
        PaymentContext context = new PaymentContext(creditCard);
        System.out.println("Using Credit Card Payment:");
        context.executePayment(100.0);

        // Change strategy to PayPalPayment and execute payment
        context = new PaymentContext(paypal);
        System.out.println("\nUsing PayPal Payment:");
        context.executePayment(200.0);
    }
}

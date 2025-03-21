class Payment {
    void processPayment() {
        System.out.println("Processing generic payment...");
    }
}
class CreditCardPayment extends Payment {
    void processPayment() {
        System.out.println("Processing credit card payment...");
    }
}
class PayPalPayment extends Payment {
    void processPayment() {
        System.out.println("Processing PayPal payment...");
    }
}

public class MethodOverridingExample2 {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new PayPalPayment();

        payment1.processPayment(); 
        payment2.processPayment(); 
    }
}

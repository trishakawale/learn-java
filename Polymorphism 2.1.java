interface Payment {
    void pay();
}

class CreditCardPayment implements Payment {
    public void pay() {
        System.out.println("Payment using Credit Card");
    }
}

class UpiPayment implements Payment {
    public void pay() {
        System.out.println("Payment using UPI");
    }
}

public class PaymentApp {
    public static void main(String[] args) {
        Payment payment;

        payment = new CreditCardPayment();
        payment.pay();

        payment = new UpiPayment();
        payment.pay();
    }
}

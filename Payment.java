abstract class Payment {
    abstract void pay(double amount);
}

class CardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Card");
    }
}

class UpiPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

public class Main {
    public static void main(String[] args) {
        Payment p1 = new CardPayment();
        Payment p2 = new UpiPayment();

        p1.pay(1200);
        p2.pay(800);
    }
}

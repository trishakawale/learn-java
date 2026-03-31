abstract class Payment {
    abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid via Credit Card: " + amount);
    }
}

class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid via UPI: " + amount);
    }
}

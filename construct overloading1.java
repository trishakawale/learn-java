class BankAccount {
    int accNo;
    double balance;

    BankAccount() {
        accNo = 0;
        balance = 0;
    }

    BankAccount(int a, double b) {
        accNo = a;
        balance = b;
    }

    void show() {
        System.out.println("AccNo: " + accNo + " Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount(12345, 5000);

        b1.show();
        b2.show();
    }
}

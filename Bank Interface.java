interface Bank {
    float getInterestRate();
}

class SBI implements Bank {
    public float getInterestRate() { return 6.5f; }
}

class HDFC implements Bank {
    public float getInterestRate() { return 7.0f; }
}

class ICICI implements Bank {
    public float getInterestRate() { return 7.5f; }
}

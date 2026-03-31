class Bank {
    final float rate = 5.0f;

    float calculateInterest(double amt) {
        return (float)(amt * rate / 100);
    }
}

void checkNumber(int num) {
    if(num < 0) {
        throw new IllegalArgumentException("Number cannot be negative");
    }
}

public class ThrowExample {
    public static void main(String[] args) {
        int marks = -5;

        if(marks < 0) {
            throw new ArithmeticException("Marks cannot be negative");
        }

        System.out.println("Valid marks");
    }
}

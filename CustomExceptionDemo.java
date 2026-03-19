class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    static void checkNumber(int num) throws MyException {
        if (num < 0) {
            throw new MyException("Number is negative");
        } else {
            System.out.println("Valid number");
        }
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}

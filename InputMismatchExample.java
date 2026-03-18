import java.util.Scanner;

public class InputMismatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            System.out.println("Number is " + num);
        }
        catch(Exception e) {
            System.out.println("Invalid input");
        }
    }
}

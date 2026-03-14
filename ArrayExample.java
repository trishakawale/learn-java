import java.util.Scanner;

class ArrayExample {

    static void display(int arr[], int index) throws ArrayIndexOutOfBoundsException {
        System.out.println("Element = " + arr[index]);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 20, 30, 40, 50};

        System.out.print("Enter index value: ");
        int index = sc.nextInt();

        try {
            display(arr, index);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index position");
        }
    }
}

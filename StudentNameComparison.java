import java.util.Scanner;

class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        if(name1.equals(name2))
            System.out.println("Same (Case-sensitive)");
        else
            System.out.println("Different (Case-sensitive)");

        if(name1.equalsIgnoreCase(name2))
            System.out.println("Same (Case-insensitive)");
        else
            System.out.println("Different (Case-insensitive)");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            int data = 25 / 5;
            System.out.println(data);
        } catch (Exception e) {
            System.out.println("Error occurred");
        } finally {
            System.out.println("Finally block always executes");
        }
    }
}

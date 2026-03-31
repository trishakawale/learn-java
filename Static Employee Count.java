class Employee {
    static int count = 0;

    Employee() {
        count++;
    }

    static void displayCount() {
        System.out.println("Total: " + count);
    }
}

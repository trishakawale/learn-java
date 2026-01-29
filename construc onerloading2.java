class Employee {
    int id;
    String name;
    double salary;

    Employee(int i, String n) {
        id = i;
        name = n;
        salary = 20000;
    }

    Employee(int i, String n, double s) {
        id = i;
        name = n;
        salary = s;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Amit");
        Employee e2 = new Employee(2, "Riya", 35000);

        e1.display();
        e2.display();
    }
}

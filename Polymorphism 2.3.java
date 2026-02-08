class Employee {
    void salary() {
        System.out.println("Base Salary");
    }
}

class Developer extends Employee {
    void salary() {
        System.out.println("Developer Salary: 80K");
    }
}

class Manager extends Employee {
    void salary() {
        System.out.println("Manager Salary: 1L");
    }
}

public class Company {
    public static void main(String[] args) {
        Employee e;

        e = new Developer();
        e.salary();

        e = new Manager();
        e.salary();
    }
}

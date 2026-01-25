class Employee {
    int empId;
    String empName;

    void getData(int id, String name) {
        empId = id;
        empName = name;
    }

    void displayEmployee() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
    }
}

// Child Class
class Salary extends Employee {
    double basicSalary;
    double hra, da, totalSalary;

    void calculateSalary(double basic) {
        basicSalary = basic;
        hra = 0.30 * basicSalary;
        da = 0.20 * basicSalary;
        totalSalary = basicSalary + hra + da;
    }

    void displaySalary() {
        displayEmployee(); // Calling parent class method
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("Total Salary  : " + totalSalary);
    }

    public static void main(String[] args) {

        // Creating object of child class
        Salary s = new Salary();

        s.getData(101, "Trisha");
        s.calculateSalary(30000);
        s.displaySalary();
    }
}

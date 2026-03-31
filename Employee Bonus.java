abstract class Employee1 {
    String name;
    int id;
    abstract double calculateBonus(double salary);
}

class Manager extends Employee1 {
    double calculateBonus(double salary) {
        return salary * 0.2;
    }
}

class Developer extends Employee1 {
    double calculateBonus(double salary) {
        return salary * 0.1 + 5000;
    }
}

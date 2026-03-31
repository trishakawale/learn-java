abstract class Shape {
    abstract double calculate_area();

    void display_info() {
        System.out.println("Shape Info");
    }
}

class Circle extends Shape {
    double r;
    Circle(double r) { this.r = r; }

    double calculate_area() {
        return Math.PI * r * r;
    }
}

class Rectangle1 extends Shape {
    double l, b;
    Rectangle1(double l, double b) {
        this.l = l; this.b = b;
    }

    double calculate_area() {
        return l * b;
    }
}

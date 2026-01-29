class Circle {
    double radius;

    Circle() {
        radius = 1;
    }

    Circle(double r) {
        radius = r;
    }

    double area() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);

        System.out.println(c1.area());
        System.out.println(c2.area());
    }
}

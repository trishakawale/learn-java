class Vehicle {
    void speed() {
        System.out.println("Vehicle speed is normal");
    }
}

class Bike extends Vehicle {
    void speed() {
        super.speed();
        System.out.println("Bike speed is fast");
    }
}

public class SuperPoly {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.speed();
    }
}

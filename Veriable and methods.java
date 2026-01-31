class Car {
    // Attributes (Fields)
    String color;
    int speed;

    // Behavior (Method)
    void accelerate() {
        speed += 10;
        System.out.println("Going faster! Speed is now: " + speed);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // Creating an 'instance' of a Car
        myCar.color = "Red";
        myCar.accelerate();
    }
}


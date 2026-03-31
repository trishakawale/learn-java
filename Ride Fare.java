abstract class Ride {
    double distance;
    Ride(double d) { distance = d; }
    abstract double calculateFare();
}

class BikeRide extends Ride {
    BikeRide(double d) { super(d); }
    double calculateFare() { return distance * 5; }
}

class AutoRide extends Ride {
    AutoRide(double d) { super(d); }
    double calculateFare() { return distance * 8; }
}

class CarRide extends Ride {
    CarRide(double d) { super(d); }
    double calculateFare() { return distance * 12; }
}

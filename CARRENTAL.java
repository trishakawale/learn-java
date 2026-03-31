class CARRENTAL {
    int carId;
    String carType;
    float rent;

    void GetCar(int id, String type) {
        carId = id;
        carType = type;
    }

    float GetRent() {
        if (carType.equalsIgnoreCase("Small"))
            rent = 1000;
        else if (carType.equalsIgnoreCase("Van"))
            rent = 800;
        else if (carType.equalsIgnoreCase("SUV"))
            rent = 2500;
        return rent;
    }

    void ShowCar() {
        System.out.println(carId + " " + carType + " " + GetRent());
    }
}

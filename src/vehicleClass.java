class vehicle10 {

    String fuelType;
    int noOfSeats;

    vehicle10(String fuelType, int noOfSeats) {
        this.fuelType = fuelType;
        this.noOfSeats = noOfSeats;
    }

    void vDetails() {
        System.out.println("Car Details: " + fuelType + " " + noOfSeats);
    }
}

class Car2 extends vehicle10 {

    String model;
    String color;
    double price;

    Car2(String fuelType, int noOfSeats, String model, String color, double price) {
        super(fuelType, noOfSeats);
        this.model = model;
        this.color = color;
        this.price = price;
    }

    void cDetails() {
        System.out.println("Car Details: " + fuelType + " " + noOfSeats + " " + model + " " + color + " " + price);
    }
}

public class vehicleClass {
    public static void main(String[] args) {
        vehicle10 v1 = new vehicle10("Petrol", 5);
        v1.vDetails();
        Car2 c1 = new Car2("Electric", 6, "KIA", "Grey", 123000);
        c1.cDetails();
    }
}

abstract class vehicle11{
    String fuelType;
    int noOfSeats;

    vehicle11(String fuelType, int noOfSeats){
        this.fuelType = fuelType;
        this.noOfSeats = noOfSeats;
    }

    abstract void start();
}

class car1 extends vehicle11{

    public car1(String fuelType, int noOfSeats) {
        super(fuelType, noOfSeats);
    }
    
    void start(){
        System.out.println("car has "+noOfSeats+" seats and the fuel type is "+fuelType);
    }
}

class motorCycle extends vehicle11{
    public motorCycle(String fuelType, int noOfSeats) {
        super(fuelType, noOfSeats);
    }
    
    void start(){
        System.out.println("motor cycle has "+noOfSeats+" seats and the fuel type is "+fuelType);
    }
}

public class abstractVehicleClass {
    public static void main(String[] args) {
        car1 c1 = new car1("Electric", 5);
        c1.start();
        motorCycle m1 = new motorCycle("Petrol", 2);
        m1.start();
    }
}

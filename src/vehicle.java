class vehicle3 {

    String fuelType;
    int noOfSeats;

    vehicle3(String fuelType, int noOfSeats) {
        this.fuelType = fuelType;
        this.noOfSeats = noOfSeats;
    }

    void vDetails() {
        System.out.println("Car Details: " + fuelType + " " + noOfSeats);
    }
}
public class vehicle {
    public static void main(String[] args) {
        vehicle3 v1=new vehicle3("petrol", 5);
        v1.vDetails();
    }

}

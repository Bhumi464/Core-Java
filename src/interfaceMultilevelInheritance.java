interface vehicle6{
    void fuelType();
}

interface  car3 extends  vehicle6{
    void noOfSeats();
}

class tata implements  car3{
    public void fuelType() {
        System.out.println("Fuel type is petrol");
    }

    public void noOfSeats() {
        System.out.println("No of seats is 5");
    }
}

public class interfaceMultilevelInheritance {
    public static void main(String[] args) {
        tata obj = new tata();
        obj.fuelType();
        obj.noOfSeats();
    }
}

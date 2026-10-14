class Rental {

    String cname;
    String proof;
    int days;
    double pricePerDay;
    double totalPrice;

    Rental(String cname, String proof, int days, double pricePerDay) {
        this.cname = cname;
        this.proof = proof;
        this.days = days;
        this.pricePerDay = pricePerDay;
    }

    void details() {
        System.out.println("Customer Name: " + cname + "\nProof: " + proof + "\nDays: " + days + "\nPrice Per Day: " + pricePerDay + "\n");
    }

    void totalPrice1() {
        totalPrice = days * pricePerDay;
        if (days >= 5) {
            double result = totalPrice - days * (pricePerDay * 0.1);
            System.out.println("Total Price after discount: " + result);
        } else {
            System.out.println("Total Price: " + totalPrice);
        }
    }
}

public class bikeRental {

    public static void main(String[] args) {
        Rental r1 = new Rental("Abhi", "DL", 10, 500);
        Rental r2 = new Rental("Ravi", "Aadhaar", 6, 550);
        r1.details();
        r2.details();
        r1.totalPrice1();
    }
}

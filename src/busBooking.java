class bus {

    String name;
    String gender;
    String source;
    String destination;
    String date;
    double price;
    double totalPrice;

    bus(String name, String gender, String source, String destination, String date, double price) {
        this.name = name;
        this.gender = gender;
        this.source = source;
        this.destination = destination;
        this.date = date;
        this.price = price;
    }

    void details() {
        System.out.println("Name: " + name + "\nGender: " + gender + "\nSource: " + source + "\nDestination: " + destination + "\nDate: " + date + "\nPrice: " + price);
    }

    void total() {
        if (destination.equals("Bengaluru") || date.equals("Saturday") || date.equals("Sunday")) {
            totalPrice = price - (price * 0.1);
            System.out.println("Total Price after discount: " + totalPrice + "\n");
        } else {
            totalPrice = price;
            System.out.println("Total Price: " + totalPrice + "\n");
        }
    }
}

public class busBooking {

    public static void main(String[] args) {
        bus b1 = new bus("Raju", "Male", "Mysore", "Bengaluru", "Friday", 600);
        bus b2 = new bus("Rani", "Female", "Telangana", "Mysore", "Monday", 1000);
        bus b3 = new bus("Ramesh", "Male", "Hubballi", "Thane", "Saturday", 2000);
        b1.details();
        b1.total();
        b2.details();
        b2.total();
        b3.details();
        b3.total();
    }
}
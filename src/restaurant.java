class restaurantOrders {
    int orderId;
    String customerName;
    String category;
    String foodItem;
    int quantity;
    double price;
    String paymentMethod;
    String address;
    double totalPrice;

    restaurantOrders(int orderId, String customerName, String category, String foodItem, int quantity, double price, String paymentMethod, String address) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.category = category;
        this.foodItem = foodItem;
        this.quantity = quantity;
        this.price = price;
        this.paymentMethod = paymentMethod;
        this.address = address;
    }

    void details() {
        System.out.println("Order ID: " + orderId + "\nCustomer Name: " + customerName + "\nCategory: " + category + "\nFood Item: " + foodItem + "\nQuantity: " + quantity + "\nPrice: " + price + "\nPayment Method: " + paymentMethod + "\nAddress: " + address);
    }

    void total() {
        totalPrice = price * quantity;
        System.out.println("Your total Price: Rs." + totalPrice);
    }

    void discount() {
        if (totalPrice >= 500) {
            double disc = totalPrice - (totalPrice * 0.2);
            System.out.println("Total Price after discount: Rs." + disc + "\n");
        } else {
            System.out.println("You didn't match to the discount orders. Total payable price: Rs." + totalPrice + "\n");
        }
    }
}

public class restaurant {

    public static void main(String[] args) {
        restaurantOrders order1 = new restaurantOrders(1001, "Ravi", "Non Veg", "Chicken Biriyani", 3, 190, "Online", "Jalahalli");
        order1.details();
        order1.total();
        order1.discount();
        restaurantOrders order2 = new restaurantOrders(1002, "Prema", "Veg", "Palav", 2, 60, "Of-Online", "Hebbala");
        order2.details();
        order2.total();
        order2.discount();
    }
}

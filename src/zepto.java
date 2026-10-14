
import java.util.Scanner;

class product5 {

    String name;
    double price;
    int quantity;
    double totalPrice;

    void display() {
        System.out.println("Product name: " + name);
        System.out.println("Product price: " + price);
        System.out.println("Product quantity: " + quantity);
    }

    void totalPrice() {
        totalPrice = price * quantity;
        System.out.println("Total price is: " + totalPrice);
    }

    void offer() {
        if (totalPrice >= 500) {
            System.out.println("Total price after discount is: "+(totalPrice - 100));
        }
        else {
            System.out.println("Total price after discount is: "+(totalPrice - 50));
        }
    }
}

public class zepto {

    public static void main(String[] args) {
        product5 p = new product5();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name: ");
        p.name = sc.nextLine();
        System.out.print("Enter product price: ");
        p.price = sc.nextDouble();
        System.out.print("Enter product quantity: ");
        p.quantity = sc.nextInt();
        p.display();
        p.totalPrice();
        p.offer();
    }
}

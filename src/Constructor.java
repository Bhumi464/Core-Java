class car {

    String model;
    String color;
    int price;

    car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    void display() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }
}

public class Constructor {

    public static void main(String[] args) {
        car obj1 = new car("Toyota", "Red", 20000);
        obj1.display();
        car obj2 = new car("KIA", "Blue", 25000);
        obj2.display();
    }
}

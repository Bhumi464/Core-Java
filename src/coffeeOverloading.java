class coffee{

    void ingredients(String ing1,String ing2){
        System.out.println("Black Coffee");
    }

    void ingredients(String ing1, String ing2, String ing3){
        System.out.println("Normal Coffee");
    }
}

public class coffeeOverloading {
    public static void main(String[] args) {
        coffee obj = new coffee();
        obj.ingredients("Water", "Coffee Powder");
        obj.ingredients("Milk", "Coffee Powder", "Sugar");
    }
}

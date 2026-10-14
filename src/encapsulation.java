class encap{
    private String productName = "apple";
    private int price = 100;

    public String getProductName(){
        return productName;
    }

    public String setProductName(String productName){
        this.productName = productName;
        return productName;
    }

    public int getPrice(){
        return price;
    }

    public int setPrice(int price){
        this.price = price;
        return price;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        encap obj = new encap();
        obj.setProductName("Kashmir Apple");
        obj.setPrice(200);
        System.out.println(obj.getProductName()+" "+obj.getPrice());
    }
}

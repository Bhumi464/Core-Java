interface zeptointerface{
    void item(String pName, double price);
    default void appName(){
        System.out.println("It is a Zepto");
    }
}

interface instamartInterface{
    void product(String pName, double price);
    static void name2(){
        System.out.println("It is an Instamart");
    }
}

class food implements zeptointerface, instamartInterface{
    public void item(String pName, double price){
        System.out.println("Product name: "+pName+" price: "+price);
    }

    public void product(String pName, double price){
        System.out.println("Product name: "+pName+" price: "+price);
    }
}

public class interfaceZeptoClass {
    public static void main(String[] args) {
        food fo = new food();
        fo.item("Icecream", 50);
        fo.product("Vegetable", 60);
        fo.appName();
        instamartInterface.name2();
    }
}

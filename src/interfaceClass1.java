interface animal4{
    default void demo(){
        System.out.println("Default methods of java 8");
    }
    static void demo1(){
        System.out.println("Static methods of java 8");
    }
}

class ant implements animal4{

}

public class interfaceClass1 {
    public static void main(String[] args) {
        ant obj = new ant();
        obj.demo();
        animal4.demo1();
    }
}

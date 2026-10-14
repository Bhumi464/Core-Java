abstract class demo{
    abstract void find();
    abstract void java();
    void greet(){
        System.out.println("Normal class");
    }
}

class demo1 extends demo {
    void find(){
        System.out.println("abstract class");
    }
    void java(){
        System.out.println("developers");
    }
}

public class abstractClass {
    public static void main(String[] args) {
        demo1 obj1 = new demo1();
        obj1.greet();
        obj1.find();
        obj1.java();
    }
}

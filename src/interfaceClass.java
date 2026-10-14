interface animal3{
    void demo();
    void wolf();
}

interface fox{
    void silent();
}

class cat implements animal3,fox{
    @Override 
    public void demo(){
        System.out.println("Java Developers");
    }

    public void wolf(){
        System.out.println("derived class");
    }

    public void silent(){
        System.out.println("Silent");
    }
}

public class interfaceClass {
    public static void main(String[] args) {
        cat obj = new cat();
        obj.demo();
        obj.wolf();
        obj.silent();
    }
}

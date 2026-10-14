
class A1 {

    private class B1 {

        void demo() {
            System.out.println("Inner class data");
        }
    }
    void java(){
        B1 obj1 = new B1();
        obj1.demo();
    }
}

public class innerClass1 {
    public static void main(String[] args) {
        A1 obj = new A1();
        obj.java();
    }
}

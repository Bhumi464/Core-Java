
class A2 {

    void java() {
        class B2 {
            void demo() {
                System.out.println("Method Inner class data");
            }
        }
        B2 obj1 = new B2();
        obj1.demo ();
    }
}

public class methodinnerClass1 {

    public static void main(String[] args) {
        A2 obj = new A2();
        obj.java();
    }
}

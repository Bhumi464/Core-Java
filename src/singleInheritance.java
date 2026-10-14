class parent2 {
    void p1(){
        System.out.println("Parent class");
    }
}

class child extends parent2 {
    void p2() {
        System.out.println("Child class");
    }
}

public class singleInheritance {
    public static void main(String[] args) {
        child obj = new child();
        parent2 obj1 = new parent2();
        obj.p1();
        obj.p2();
        obj1.p1();
    }
}
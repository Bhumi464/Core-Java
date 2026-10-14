class A{
    void one(){
        System.out.println("Parent class");
    }
}

class B extends A{
    void two(){
        System.out.println("Child 1");
    }
}

class C extends A{
    void three(){
        System.out.println("Class 2");
    }
}

public class hierarchicalInheritance {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.one();
        B obj2 = new B();
        obj2.one();
        obj2.two();
        C obj3 = new C();
        obj3.one();
        obj3.three();
    }
}

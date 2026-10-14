class overloading{
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}

public class overloadingClass {
    public static void main(String[] args) {
        overloading obj = new overloading();
        obj.add(6, 4);
        obj.add(5, 3,7);
    }
}

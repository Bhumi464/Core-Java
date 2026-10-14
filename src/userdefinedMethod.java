class userDefined {

    public void greet() {
        System.out.println("Hello Developers");   //method declaration
    }

    public void add(int a, int b) {
        System.out.println("Sum of two numbers: " + (a + b));
    }

    public int sub(int a, int b){
        return a-b;
    }
}

public class userdefinedMethod {

    public static void main(String[] args) {
        userDefined obj1 = new userDefined();
        obj1.greet();   //method call
        obj1.add(6, 2);
        System.out.println("Subtraction of two numbers: "+obj1.sub(9,3 ));

    }
}
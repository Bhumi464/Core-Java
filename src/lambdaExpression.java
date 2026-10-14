
interface in {

    int add(int a, int b);
}

public class lambdaExpression {

    public static void main(String[] args) {
        in obj = (int a, int b) -> a + b;
        System.out.println("Addition is: " + obj.add(10, 20));
    }
}

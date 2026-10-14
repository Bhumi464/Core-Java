import java.util.Scanner;

public class predefined {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Max number is: " + Math.max(a, b));
        System.out.println("Min number is: " + Math.min(a, b));
        System.out.println("Absolute value of a is: " + Math.abs(a));
        System.out.println("Square root of a is: " + Math.sqrt(a) + "and square root of b is: "+Math.sqrt(b));
    }
}

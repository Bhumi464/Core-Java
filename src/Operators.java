import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        //bitwise operators
        System.out.println("bitwise AND is: "+(a&b));
        System.out.println("bitwise OR is: "+(a|b));
        System.out.println("bitwise XOR is: "+(a^b));
        System.out.println("bitwise COMPLIMENTARY is: "+(~a));
        System.out.println("bitwise LEFT SHIFT is: "+(a<<2));
        System.out.println("bitwise RIGHT SHIFT is: "+(a>>2));

        //arithmetic operators
        System.out.println("Addition is: "+(a+b));
        System.out.println("Subtraction is: "+(a-b));
        System.out.println("Multiplication is: "+(a*b));
        System.out.println("Division is: "+(a/b));
        System.out.println("Modulus is: "+(a%b));

        //relational operators
        System.out.println("a==b: "+(a==b));
        System.out.println("a!=b: "+(a!=b));
        System.out.println("a>b: "+(a>b));
        System.out.println("a<b: "+(a<b));
        System.out.println("a>=b: "+(a>=b));
        System.out.println("a<=b: "+(a<=b));

        //logical operators
        System.out.println("a>b && a<b: "+(a>b && a<b));
        System.out.println("a>b || a<b: "+(a>b || a<b));
        System.out.println("!(a>b): "+!(a>b));

        //assignment operators
        System.out.println("a++: "+(a++));
        System.out.println("b--: "+(b--));
        System.out.println("a*=a: "+(a*=a));
        System.out.println("b/=b: "+(b/=b));
    }
}
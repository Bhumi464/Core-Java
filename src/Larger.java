import java.util.Scanner;

public class Larger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a, b and c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//using if else if condition

        // if (a>b && a>c){
        //     System.out.println(a+" is the largest number");
        // }
        // else if (b>a && b>c){
        //     System.out.println(b+" is the largest number");
        // }
        // else{
        //     System.out.println(c+" is the largest number");
        // }

        // using nested condition
        if (a>b){
            if (a>c){
                System.out.println(a+" is the largest number");
            }
            else{
                System.out.println(c+" is the largest number");
            }
        }
        else{
            if (b>c){
                System.out.println(b+" is the largest number");
            }
            else{
                System.out.println(c+" is the largest number");
            }
        }
    }
}


import java.util.Scanner;

public class whileLoop {

    public static void main(String[] args) {
        
// To iterate the numbers
        // int i = 0;
        // while (i<=5) {
        //     System.out.println(i);
        //     i++;

// To count how many numbers are present
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number:");
        // int n = sc.nextInt();
        // int count = 0;
        // while (n > 0) {
        //     n = n / 10;
        //     count++;
        // }
        // System.out.println("count is: " + count);

//To reverse the number
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number:");
        // int n = sc.nextInt();
        // int reverse = 0;
        // while (n>0){
        //     int num = n%10;
        //     reverse = reverse * 10 + num;
        //     n = n / 10;
        // }
        // System.out.println("Reverse value: "+reverse);

// To check Palindrome or not
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number:");
        // int n = sc.nextInt();
        // int original = n; //to store n value because n value will change in while loop
        // int reverse = 0;
        // while (n>0){
        //     int num = n%10;
        //     reverse = reverse * 10 + num;
        //     n = n / 10;
        // }
        // if (original == reverse){
        //     System.out.println("It is a palindrome");
        // }
        // else{
        //     System.out.println("It is not a palindrome");
        // }

// // To check the number is armstrong or not
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number:");
//         int n = sc.nextInt();
//         int original = n;
//         int a = 0;
//         while (n>0){
//             int num = n%10;
//             a = a + (num*num*num);
//             n = n/10;
//         }
//         if (original == a){
//             System.out.println("It is armstrong number");
//         }
//         else{
//             System.out.println("It is not a armstrong number");
//         }

// The sum of the numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            int num = n % 10;
            sum = sum + num;
            n = n / 10;
        }
        System.out.println("Sum is: " + sum);
    }
}

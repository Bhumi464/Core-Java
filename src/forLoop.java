import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {

// To iterate the numbers
        // for (int i = 0; i <= 5; i++) {
        //     System.out.println(i);
        // }

// To check prime number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        boolean num = true;
        for (int i = 2; i <n; i++){
            if (n%i == 0){
                num = false;
                break;
            }
        }
        if(num){
            System.out.println("It is prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }
    }
}

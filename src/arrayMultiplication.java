import java.util.Scanner;

public class arrayMultiplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array1: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array1: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the array2: ");
        int size2 = sc.nextInt();
        int arr2[] = new int[size2];
        System.out.println("Enter the elements of the array2: ");
        for(int i = 0; i < size2; i++){
            arr2[i] = sc.nextInt();
        }
        //multiplication of two arrays
        int result[] = new int[size];
        for(int i = 0; i < size; i++){
            result[i] = arr[i] * arr2[i];
        }
        System.out.println("Multiplication of two arrays: ");
        for(int i = 0; i < size; i++){
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}

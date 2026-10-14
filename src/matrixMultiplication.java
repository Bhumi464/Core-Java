import java.util.Scanner;

public class matrixMultiplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of matrix1: ");
        int rows1 = sc.nextInt();
        System.out.println("Enter the number of columns of matrix1: ");
        int cols1 = sc.nextInt();
        int matrix1[][] = new int[rows1][cols1];
        System.out.println("Enter the elements of matrix1: ");
        for(int i = 0; i < rows1; i++){
            for(int j = 0; j < cols1; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number of rows of matrix2: ");
        int rows2 = sc.nextInt();
        System.out.println("Enter the number of columns of matrix2: ");
        int cols2 = sc.nextInt();
        int matrix2[][] = new int[rows2][cols2];
        System.out.println("Enter the elements of matrix2: ");
        for(int i = 0; i < rows2; i++){
            for(int j = 0; j < cols2; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        if(cols1 != rows2){
            System.out.println("Matrix multiplication is not possible");
        }else{
            int result[][] = new int[rows1][cols2];
            for(int i = 0; i < rows1; i++){
                for(int j = 0; j < cols2; j++){
                    for(int k = 0; k < cols1; k++){
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            System.out.println("Multiplication of two matrices: ");
            for(int i = 0; i < rows1; i++){
                for(int j = 0; j < cols2; j++){
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}


public class rightAngleTriangle {

    public static void main(String[] args) {

// To print right angle triangle of stars
        // for (int i = 1; i <=4; i++){
        //     for (int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        // System.out.println();
        // }

// To print right angle triangle of numbers
        // for (int i = 1; i <=4; i++){
        //     for (int j=1;j<=i;j++){
        //         System.out.print(i + " ");
        //     }
        // System.out.println();
        // }

// To print right angle triangle of numbers in increasing order
        // for (int i = 1; i <=4; i++){
        //     for (int j=1;j<=i;j++){
        //         System.out.print(j + " ");
        //     }
        // System.out.println();
        // }

//  to print right angle triangle of numbers in increasing order from 1
        // int num = 1;
        // for (int i = 1; i <=4; i++){
        //     for (int j=1;j<=i;j++){
        //         System.out.print(num + " ");
        //         num++;
        //     }
        // System.out.println();
        // }
        
// To print right angle triangle of stars in reverse order
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

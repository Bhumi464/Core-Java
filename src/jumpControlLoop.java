public class jumpControlLoop {
    public static void main(String[] args){
        int i = 0;
// continue statement
        while(i<5){
            if(i==3){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

// break statement
        // while(i<5){
        //     if(i==3){
        //         break;
        //     }
        //     System.out.println(i);
        //     i++;
        // }
    }
}

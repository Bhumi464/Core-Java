public class arrayEvenOrOdd {
    public static void main(String[] args) {
        int num[]={9,1,4,8,7,7,2,0};
        int e_count=0;
        int o_count=0;
        for (int i=0;i<num.length;i++){
            int even=num[i];
            if (even%2==0){
                e_count+=1;
            }
            else {
                o_count+=1;
            }
        }
        System.out.println("Count of Even numbers: "+e_count);
        System.out.println("Count of Even numbers: "+o_count);

// using for each loop
        int even=0;
        int odd=0;
        for (int i:num){
            if (i%2==0){
                even+=1;
            }
            else {
                odd+=1;
            }
        }
        System.out.println("Count of Even numbers: "+even);
        System.out.println("Count of Even numbers: "+odd);
    }
}

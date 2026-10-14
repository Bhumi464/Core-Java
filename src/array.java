public class array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        arr[3]=6;
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);
        double avg = (double) sum/arr.length;
        System.out.println("Average: " + avg);
    }

}

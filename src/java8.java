
// class demo3 implements Consumer<Integer>{
//     @Override
//     public void accept(Integer i) {
//         System.out.println(i);
//     }
// }

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class java8 {

    public static void main(String[] args) {
        //List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    //using anonymous class
        // Consumer<Integer> obj = new demo3(){
        //     public void accept(Integer i) {
        //     System.out.println(i);
        //     }
        // };
        // obj.accept(1);

    //using normal class
        // demo3 obj = new demo3();
        // obj.accept(1);
    //printing in normal form
        //System.out.println(l1);
    //printing using for loop
        // for (int i = 0; i <l1.size(); i++) {
        //     System.out.println(l1.get(i));
        // }
    //printing using enhanced for each loop
        // for(Integer i:l1){
        //     System.out.println(i);
        // }
    //using lambda expression
        //Consumer<Integer> obj = (Integer i)-> System.out.println(i);
// 1st feature of java 8 is lambda expression which is used to implement functional interface
    //printing using for each method feature
        //l1.forEach(i-> System.out.println(i));
//2nd feature of java 8 is method reference which is used to print the data
//3rd feature of java 8 is stream which is used to perform operations on data
    //using stream and method reference features
        // Stream<Integer> s1 = l1.stream();
        // s1.forEach(System.out::println);
        // System.out.println();
    //Stream has 3 methods filter, map and reduce
        // Stream<Integer> s2 = l1.stream().filter(i -> i % 2 == 0).map(i -> i * 2);
        //s2.forEach(System.out::println);
        // int r = l1.stream().filter(i -> i % 2 == 0).map(i -> i * 2).reduce(0, (i, j) -> i + j);
        // System.out.println(r);
    
    // 4th feature of java 8 is date and time api which is used to get the current date and time
        LocalTime t1 = LocalTime.now();
        System.out.println(t1);
        LocalDate d1 = LocalDate.now();
        System.out.println(d1);
        //using time zones
        LocalTime t2 = LocalTime.now(ZoneId.of("Europe/London"));
        LocalDate d2 = LocalDate.now(ZoneId.of("Europe/London"));
        System.out.println(t2);
        System.out.println(d2);


        // for(String s: ZoneId.getAvailableZoneIds()){
        //     System.out.println(s);
        // }
    // 5th feature is functional interface
    // 6th feature is lambda expression
    }
}

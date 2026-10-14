import java.util.LinkedList;
import java.util.List;

public class linkedList1 {
    public static void main(String[] args) {
        List <Integer> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        System.out.println(l1);
        l1.add(1,50);
        System.out.println(l1);
        l1.addFirst(40);
        System.out.println(l1);
        l1.addLast(60);
        System.out.println(l1);
        l1.remove(1);
        System.out.println(l1);
        l1.removeLast();
        System.out.println(l1);
        System.out.println(l1.getFirst());
        System.out.println(l1.get(2));
        System.out.println(l1.size());
    }
}

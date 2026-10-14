import java.util.HashSet;

public class hashSet {

    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>();
        h1.add(41);
        h1.add(22);
        h1.add(30);
        h1.add(2);
        System.out.println(h1);
        h1.remove(2);
        System.out.println(h1);
        System.out.println(h1.contains(30));
        System.out.println(h1.size());
        System.out.println(h1.isEmpty());
    }
}

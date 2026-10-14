public class treeSet {
    public static void main(String[] args) {
        java.util.TreeSet<Integer> t1 = new java.util.TreeSet<>();
        t1.add(41);
        t1.add(22);
        t1.add(30);
        t1.add(2);
        System.out.println(t1);
        t1.remove(2);
        System.out.println(t1);
        System.out.println(t1.contains(30));
        System.out.println(t1.size());
        System.out.println(t1.isEmpty());
    }
}

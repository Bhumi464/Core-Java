import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);
        System.out.println(s1.peek());
        System.out.println(s1.size());
        s1.push(50);
        s1.push(40);
        System.out.println(s1);
        System.out.println(s1.search(20));
        System.out.println(s1.firstElement());
        System.out.println(s1.lastElement());
        System.out.println(s1.get(2));
        System.out.println(s1.contains(30));
    }
}

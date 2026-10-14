import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter roll:");
        String roll = sc.nextLine();
        System.out.println("Enter branch:");
        String branch = sc.nextLine();
        System.out.println("Enter College name:");
        String college = sc.nextLine();
        System.out.println("Enter age:");
        int age = sc.nextInt();
        System.out.println("Enter phone:");
        long phone = sc.nextLong();
        System.out.println("Enter cgpa:");
        double cgpa = sc.nextDouble();
        System.out.println("My name is "+name+" roll no. is "+roll+" branch is "+branch+" college name is "+college+" age is "+age+" phone no. is "+phone+" and cgpa is "+cgpa);
    }
}

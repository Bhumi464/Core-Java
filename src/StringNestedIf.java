import java.util.Scanner;

public class StringNestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Role:");
        String role = sc.nextLine();
        System.out.println("Enter the Username:");
        String username = sc.nextLine();
        System.out.println("Enter the Password:");
        String password = sc.nextLine();
        if (role.equals("admin")){
            if (username.equals("admin")){
                if(password.equals("12345")){
                    System.out.println("You are eligible to enter the Admin page");
                }
                else{
                    System.out.println("You are restricted to enter the Admin page");
                }
            }
        }
        else if(role.equals("developer")){
            System.out.println("Your work is developer");
        }
        else{
            System.out.println("You are not eligible to work here");
        }
    }
}

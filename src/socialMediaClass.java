import java.util.Scanner;

interface socialMedia{
    void profile(String username, String password);
}

class snapshot implements socialMedia{
    public void profile(String username, String password){
        System.out.println("UserName: "+username+" Password: "+password);
    }
}

class facebook implements socialMedia{
    public void profile(String username, String password){
        System.out.println("UserName: "+username+" Password: "+password);
    }
}
class instagram implements socialMedia{
    public void profile(String username, String password){
        System.out.println("UserName: "+username+" Password: "+password);
    }
}
class whatsapp implements socialMedia{
    public void profile(String username, String password){
        System.out.println("UserName: "+username+" Password: "+password);
    }
}

public class socialMediaClass {
    public static void main(String[] args) {
        snapshot s = new snapshot();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UserName and Password for snapshot:");
        String a = sc.nextLine();
        String b = sc.nextLine();
        s.profile(a,b);
        facebook f = new facebook();
        System.out.println("Enter UserName and Password for facebook:");
        String c = sc.nextLine();
        String d = sc.nextLine();
        f.profile(c,d);
        instagram i = new instagram();
        System.out.println("Enter UserName and Password for instagram:");
        String e = sc.nextLine();
        String g = sc.nextLine();
        i.profile(e,g);
        whatsapp w = new whatsapp();
        System.out.println("Enter UserName and Password for whatsapp:");
        String h = sc.nextLine();
        String j = sc.nextLine();
        w.profile(h,j);
        
    }
}


class parent1 {

    void mobile() {
        System.out.println("Parent mobile");
    }
}

class child1 extends parent1 {
    void mobile(String name, String ram) {
        System.out.println("child mobile name "+name+" "+ram);
    }
}

public class overridingClass {
    public static void main(String[] args) {
        child1 ch = new child1();
        ch.mobile();
        ch.mobile("vivo","8GB");
    }
}

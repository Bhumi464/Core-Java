class person1{
    String name = "Bhumi";
    int age = 20;
}

class dog2{
    String name = "Tommy";
    String breed = "German Shepherd";
}

public class classObject {
    public static void main(String[] args) {
        person1 p = new person1();
        dog2 d = new dog2();
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(d.name);
        System.out.println(d.breed);
    }
}


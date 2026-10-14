interface i{
    void demo();
}

public class anonymousClass {
    public static void main(String[] args) {

// using anonymous class
        // i obj = new i() {
        //     public void demo(){
        //         System.out.println("developers");
        //     }
        // };


// using lambda expression 
        i obj = () -> System.out.println("developers");
        obj.demo();
    }
}

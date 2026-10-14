interface notification{
    void message(String message);
}

class SMS implements notification{
    public void message(String message){
        System.out.println("your otp is "+message);
    }
}

class whatsapp1 implements notification{
    public void message(String message){
        System.out.println("your feedback is "+message);
    }
}

class gMail implements notification{
    public void message(String message){
        System.out.println("your transaction is done for "+message);
    }
}

public class notificationClass {
    public static void main(String[] args) {
        SMS s = new SMS();
        s.message("15632");
        whatsapp1 w = new whatsapp1();
        w.message("excellent");
        gMail g = new gMail();
        g.message("cosmetics");
    }
}

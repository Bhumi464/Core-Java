abstract class doctor{
    String name;
    int age;

    doctor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void card1();
    abstract void neo1(String a, int b);
}

class cardiologist extends doctor{

    cardiologist(String name, int age) {
        super(name, age);
    }
    void card1(){
        System.out.println("Cardiologist doctor name is "+name+" age is "+age);
    }
    void neo1(String a,int b){
        System.out.println("Neurologist doctor name is "+a+" age is "+b);
    }
}

public class abstractDoctorClass {
    public static void main(String[] args) {
        cardiologist cardio = new cardiologist("Dr.Suresh", 35);
        cardio.card1();
        cardio.neo1("Dr.Ravi",46);
    }
}

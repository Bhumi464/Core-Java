class Animal1{
    String type;
    String name;

    public Animal1(String type, String name) {
        this.type = type;
        this.name = name;
    }

    void aDisplay(){
        System.out.println("Animals details: "+type+ " "+name);
    }
}

class dog extends Animal1{
    String breed;

    public dog(String type, String name, String breed) {
        super(type, name);
        this.breed = breed;
    }

    void dDisplay(){
        System.out.println("Dog details: "+type+" "+name+" "+breed);
    }
}

class babydog extends dog{
    String color;

    public babydog(String type, String name, String breed, String color) {
        super(type , name, breed);
        this.color = color;
    }
    
    void bDetails(){
        System.out.println("Baby dog details: "+type+" "+name+" "+breed+" "+color);
    }
}

public class animal {
    public static void main(String[] args) {
        Animal1 animal = new Animal1("Dog", "Doggy");
        animal.aDisplay();
        dog d1 = new dog("Dog", "rocky", "Shepherd");
        d1.dDisplay();
        d1.aDisplay();
        babydog baby = new babydog("dog", "cutei", "petbul", "black");
        baby.aDisplay();
        baby.dDisplay();
        baby.bDetails();
    }
}

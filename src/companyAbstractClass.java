abstract class company {
    String eName;
    String role;
    int noOfYears;
    double bonus;

    public company(String eName, String role, int noOfYears, double bonus) {
        this.eName = eName;
        this.role = role;
        this.noOfYears = noOfYears;
        this.bonus = bonus;
    }

    void display(){
        System.out.println("Employee name: "+eName+"\nRole: "+role+"\nNumber of Years: "+noOfYears+"\nBonus: "+bonus);
    }

    abstract void experience();
}

class emp extends company{
    emp (String eName, String role, int noOfYears, double bonus){
        super(eName, role, noOfYears, bonus);
    }

    void experience(){
        if (noOfYears >=5){
            System.out.println("Senior");
        }
        else{
            System.out.println("Junior");
        }
    }
}

public class companyAbstractClass {
    public static void main(String[] args) {
        emp obj = new emp("Ramya","Developer",3,3000);
        obj.display();
        obj.experience();
    }
}

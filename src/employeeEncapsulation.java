class employee{
    private String eName = "Rashi";
    private String eRole = "HR";
    private double salary = 25000;
    private int eId = 103;

    String getEName(){
        return eName;
    }

    String getERole(){
        return eRole;
    }

    double getSalary(){
        return salary;
    }

    int getEId(){
        return eId;
    }

    String setEName(String eName){
        this.eName = eName;
        return eName;
    }

    String setERole(String eRole){
        this.eRole = eRole;
        return eRole;
    }

    double setSalary(double  salary){
        this.salary = salary;
        return salary;
    }

    int setEId(int eId){
        this.eId = eId;
        return eId;
    }
}

public class employeeEncapsulation {
    public static void main(String[] args) {
        employee emp = new employee();
        emp.setEName("Rakshitha");
        emp.setERole("Java developer");
        emp.setSalary(27500);
        emp.setEId(110);
        System.out.println("Employee name: "+emp.getEName()+"\nrole: "+emp.getERole()+"\nSalary: "+emp.getSalary()+"\nEmployee ID: "+emp.getEId());
    }
}

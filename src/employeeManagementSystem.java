import java.util.ArrayList;
import java.util.List;

class empDetails{
    int eId;
    String name;
    String department;
    double salary;

    public empDetails(int eid, String name, String department, double salary) {
        this.eId = eid;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class employeeManagementSystem {
    public static void main(String[] args) {
        List<empDetails> details = new ArrayList<>();
        details.add(new empDetails(101, "Sahana", "IT", 25000));
        details.add(new empDetails(102, "Ramya", "HR", 20000));
        details.add(new empDetails(103, "Lohith", "IT", 30000));
        details.add(new empDetails(101, "Sahana", "IT", 25000));
        details.add(new empDetails(104, "Rahul", "IT", 26000));
        details.add(new empDetails(105, "Kavana", "HR", 23000));
        details.add(new empDetails(106, "Likith", "Account", 15000));
        details.add(new empDetails(107, "Sohit", "Testing", 29000));
        
        for(empDetails emp:details){
            if(emp.department.equals("IT")){
                System.out.println("Employee ID: "+emp.eId);
                System.out.println("Employee Name: "+emp.name);
                System.out.println("Department: "+emp.department);
                System.out.println("Employee Salary: "+emp.salary);
                System.out.println();
            }
        }
        
        double highestSalary = 0;
        for(empDetails emp:details){
            if(emp.salary>highestSalary){
                highestSalary = emp.salary;
            }
        }

        for(empDetails emp:details){
            if(emp.salary == highestSalary){
                System.out.println("Highest salary is "+emp.salary+" received from "+emp.name+" bearing Employee ID "+emp.eId+" from department "+emp.department);
            }
        }

        for(int i = 0;i<details.size()-1;i++){
            if(details.get(i).salary>details.get(i+1).salary){
                empDetails temp = details.get(i);
                details.set(i, details.get(i+1));
                details.set(i+1, temp);
            }
        }

        
    }
}

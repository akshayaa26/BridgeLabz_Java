package Constructors.AccessModifiers;
public class EmployeeSystemRunne {

    public static void main(String[] args) {

        EmployeeBase emp1 = new EmployeeBase(1001, "IT", 60000);

        System.out.println("👨‍💼 Employee Details");
        emp1.displayEmployeeDetails();

        emp1.updateSalary(70000);

        System.out.println("\nAfter Salary Update:");
        System.out.println("Updated Salary: ₹" + emp1.getSalary());

        System.out.println("\n-----------------------------\n");

        DepartmentManager mgr =
                new DepartmentManager(2001, "HR", 90000, "Senior Manager");

        System.out.println("👔 Manager Details");
        mgr.displayManagerDetails();
    }
}

class EmployeeBase {

    public int employeeID;
    protected String department;
    private double salary;

    EmployeeBase(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void updateSalary(double newSalary) {
        if (newSalary > 0) {
            salary = newSalary;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : ₹" + salary);
    }
}

class DepartmentManager extends EmployeeBase {

    String designation;

    DepartmentManager(int employeeID,
                      String department,
                      double salary,
                      String designation) {

        super(employeeID, department, salary);
        this.designation = designation;
    }

    void displayManagerDetails() {
        System.out.println("Employee ID : " + employeeID);   // public
        System.out.println("Department  : " + department);   // protected
        System.out.println("Salary      : ₹" + getSalary()); // private via getter
        System.out.println("Designation : " + designation);
    }
}

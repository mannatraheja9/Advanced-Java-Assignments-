class Employee {
    private String name;
    private int id;
    private double salary;
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void EmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: $" + salary);
    }
}
class Manager extends Employee {
    private double bonus;
    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public void ManagerInfo() {
        EmployeeInfo();
        System.out.println("Manager Bonus: $" + bonus + "\n");
    }
}

public class InheritanceEgEmployee {
    public static void main(String args[]) {
        Employee emp1= new Employee("Rajat", 101, 100000);
        System.out.println("\nEmployee:");
        emp1.EmployeeInfo();

        Manager manager1 = new Manager("Alisha", 102, 500000, 5000);
        System.out.println("\nManager :");
        manager1.ManagerInfo();
    }
}

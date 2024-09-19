package assignment2;

class Employee {
    public String getRole() {
        return "Employee";
    }
}

class Manager extends Employee {
    @Override
    public String getRole() {
        return "Manager";
    }
}

class Developer extends Employee {
    @Override
    public String getRole() {
        return "Developer";
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        // Creating objects of Manager and Developer
        Employee emp1 = new Manager();   //Dynamic method dispatch
        Employee emp2 = new Developer();

        // Invoking the overridden getRole() method
        System.out.println("emp1 is a: " + emp1.getRole()); // Output: Manager
        System.out.println("emp2 is a: " + emp2.getRole()); // Output: Developer
    }
}

// Base class
class User {
    private int id;
    private String name;

    // Parameterized constructor
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters for id and name
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

// Subclass
class Employee extends User {
    private double salary;

    // Parameterized constructor
    public Employee(int id, String name, double salary) {
        super(id, name); // Call to the base class constructor
        this.salary = salary;
    }

    // Method to calculate annual salary
    public double calculateAnnualSalary() {
        return salary * 12; // Assuming salary is monthly
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }
}

// Main class
public class userMain {
    public static void main(String[] args) {
        // Create an object of the Employee class
        Employee emp = new Employee(101, "Alisha", 100000.0);

        // Calculate annual salary
        double annualSalary = emp.calculateAnnualSalary();

        // Display employee details and annual salary
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Monthly Salary: " + emp.getSalary());
        System.out.println("Annual Salary: " + annualSalary);
    }
}

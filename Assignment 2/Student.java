package assignment2;

public class Student {
    private String name;
    private int grade;

    // Constructor
    public Student(String name, int grade) {
        setName(name); // Use the setter to enforce validation
        setGrade(grade); // Use the setter to enforce validation
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name with validation
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    // Getter for grade
    public int getGrade() {
        return grade;
    }

    // Setter for grade with validation
    public void setGrade(int grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }
        this.grade = grade;
    }

    // Optional: toString method for better representation
    @Override
    public String toString() {
        return "Student{name='" + name + "', grade=" + grade + "}";
    }

    public static void main(String[] args) {
        try {
            // Create a valid student
            Student student = new Student("Alisha", 98);
            System.out.println(student);

            // Attempt to set an invalid grade
            student.setGrade(129); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Attempt to set an empty name
            Student student2 = new Student("", 90); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

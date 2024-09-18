class Student {
    private String name;
    private int age;
    private char grade;

    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("\n ");
    }
}

public class StudentInfo {
    public static void main(String[] args) {
        Student st1 = new Student("Anshita", 11, 'A');
        Student st2 = new Student("Anusha", 11, 'B');
        Student st3 = new Student("Aradhana", 12, 'D');
        st1.printInfo();
        st2.printInfo();
        st3.printInfo();

    }
}

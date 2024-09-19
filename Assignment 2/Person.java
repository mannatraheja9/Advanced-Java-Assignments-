package assignment2;

public class Person {
    private String name;
    private int age;
    private String address;

    // Constructor
    public Person(String name, int age, String address) {
        this.name = name;
        setAge(age); // Use the setter to enforce the age constraint
        this.address = address;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be less than 0");
        }
        this.age = age;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Setter for address
    public void setAddress(String address) {
        this.address = address;
    }

    // Optional: toString method for better representation
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", address='" + address + "'}";
    }

    public static void main(String[] args) {
        try {
            Person person = new Person("Alisha", 23, "Chicago");
            System.out.println(person);

            person.setAge(30); // Valid age
            System.out.println("Updated age: " + person.getAge());

            person.setAge(-5); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}





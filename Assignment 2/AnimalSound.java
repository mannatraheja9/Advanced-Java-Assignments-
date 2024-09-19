package assignment2;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class AnimalSound {
    public static void main(String[] args) {
        // Create instances of Dog and Cat
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Call makeSound() method on both objects
        myDog.makeSound(); // Output: Dog barks
        myCat.makeSound(); // Output: Cat meows
    }
}

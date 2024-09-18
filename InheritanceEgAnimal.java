class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog makes a barking sound.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat makes a 'meow' sound.");
    }
}

public class InheritanceEgAnimal {
    public static void main(String args[]) {
        Animal Dog1 = new Dog();
        Animal Cat1 = new Cat();

        Dog1.makeSound(); 
        Cat1.makeSound();
    }
}

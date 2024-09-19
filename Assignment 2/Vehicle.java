package assignment2;

public class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void stop() {
        System.out.println("Vehicle is stopping");
    }

    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        // Start and stop the car
        myCar.start(); // Output: Car is starting with a roar
        myCar.stop();  // Output: Car is stopping smoothly

        // Start and stop the bike
        myBike.start(); // Output: Bike is starting with a vroom
        myBike.stop();  // Output: Bike is stopping quickly
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting with a roar");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping smoothly");
    }
}


class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting with a vroom");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping quickly");
    }
}




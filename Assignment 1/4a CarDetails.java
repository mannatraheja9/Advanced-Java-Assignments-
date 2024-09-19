class Car {
    private String brand;
    private String model;
    private double price;

    public Car() {
        this.brand = "Not specified";
        this.model = "Not specified";
        this.price = 0.0;
    }

    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void CarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price + "\n");
    }
}

public class CarDetails {
    public static void main(String args[]) {
        Car unspecifiedCar = new Car();
        System.out.println("Car details are as follows: ");
        unspecifiedCar.CarInfo();

        Car Car1 = new Car("Rolls Royce", "Phantom", 600000.0);
        System.out.println("Car details are as follows: ");
        Car1.CarInfo();
    }
}

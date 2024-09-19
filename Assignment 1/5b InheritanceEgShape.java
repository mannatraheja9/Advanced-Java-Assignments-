abstract class Shape {
    public abstract double area();
}
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double breadth;
    private double height;
    public Rectangle(double breadth, double height) {
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    public double area() {
        return breadth * height;
    }
}

class Square extends Shape {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    @Override
    public double area() {
        return side * side;
    }
}

public class InheritanceEgShape {
    public static void main(String args[]) {
        Shape circle = new Circle(7);
        Shape rectangle = new Rectangle(6, 8);
        Shape square = new Square(6);

        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Square: " + square.area());
    }
}

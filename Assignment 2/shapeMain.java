package assignment2;
class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println("Shape color: " + color);
    }
}


class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color); // Call the constructor of Shape
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void display() {
        super.display(); // Display color from Shape
        System.out.println("Circle radius: " + radius);
        System.out.println("Circle area: " + area());
    }
}


class ColoredCircle extends Circle {
    private String borderColor;

    public ColoredCircle(String color, double radius, String borderColor) {
        super(color, radius); // Call the constructor of Circle
        this.borderColor = borderColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    public void display() {
        super.display(); // Display from Circle
        System.out.println("Border color: " + borderColor);
    }
}


public class shapeMain {
    public static void main(String[] args) {
        ColoredCircle coloredCircle = new ColoredCircle("Red", 7.0, "Blue");

        // Display the details of the ColoredCircle
        coloredCircle.display();
    }
}


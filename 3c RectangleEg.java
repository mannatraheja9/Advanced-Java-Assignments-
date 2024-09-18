class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double Area() {
        return length * width;
    }

    public double Perimeter() {
        return 2 * (length + width);
    }
}

public class RectangleEg {
    public static void main(String args[]) {
        Rectangle rect1 = new Rectangle(6, 8);

        System.out.println("Area of Rectangle: " + rect1.Area());
        System.out.println("Perimeter of Rectangle: " + rect1.Perimeter());
    }
}

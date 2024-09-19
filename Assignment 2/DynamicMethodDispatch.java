package assignment2;

abstract class Shapes {
    // Abstract method
    abstract void draw();
}

class Circles extends Shapes {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangles extends Shapes {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // Create Shape references for Circle and Rectangle
        Shapes shape1 = new Circles();
        Shapes shape2 = new Rectangles();

        // Invoke the draw() method on each shape
        shape1.draw(); // Output: Drawing a Circle
        shape2.draw(); // Output: Drawing a Rectangle
    }
}

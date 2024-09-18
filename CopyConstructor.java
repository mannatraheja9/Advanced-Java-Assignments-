class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point point) {
        this.x = point.x;
        this.y = point.y;
    }
    public void view() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}

public class CopyConstructor {
    public static void main(String args[]) {
        Point p1 = new Point(3, 2);
        System.out.print("Original: ");
        p1.view();

        Point p2 = new Point(p1);
        System.out.print("Copied: ");
        p2.view();
    }
}

public class FibonacciSeries {
    public static void main(String args[]) {
        int limit = 50;
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci sequence up to " + limit + ": ");
        for (int i = 0; a <= limit; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}

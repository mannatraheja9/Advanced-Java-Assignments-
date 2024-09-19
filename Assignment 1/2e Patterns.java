public class Patterns {
    public static void main(String args[]) {
        System.out.println("Pattern 1");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("Pattern 2");

        for (int i = 1; i <= 3; i++) {
            for (int j = i; j < 3; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

        System.out.println(" ");
        System.out.println("Pattern 2");


        for (int i = 3; i >= 1; i--) {
            for (int j = 0; j < 3 - i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}










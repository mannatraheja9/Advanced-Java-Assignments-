import java.util.*;
public class Maxof2numbers {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();
        System.out.println((num1 > num2)?("First number is the greater number."):("Second number is the greater number."));
    }
}

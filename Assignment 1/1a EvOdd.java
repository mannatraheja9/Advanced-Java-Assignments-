import java.util.*;
public class EvOdd {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = scan.nextInt();
        EvOddCheck(num);
    }
    static void EvOddCheck(int num){
        if(num%2 == 0) {
            System.out.println("The number is even.");
        }
            else{
                System.out.println("The number is odd.");
        }
    }
}

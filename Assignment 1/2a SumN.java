import java.util.*;
public class SumN {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the limit for calculating sum: ");
        int n = scan.nextInt();
        int sum =0;
        for(int i =1; i<=n; i++){
            sum = sum +i;
        }
                System.out.println("The sum of the first"+n+ "natural numbers is "+ sum );
    }
}

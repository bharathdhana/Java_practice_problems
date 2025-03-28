/* Number is Odd or Even using Bitwise Operator */
import java.util.Scanner;

public class BitwiseOddEven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter number: ");
        int num1 = sc.nextInt();

        if((num1 & 1 ) == 0) {
            System.out.print(" Even "); 
        } else {
            System.out.print(" Odd "); 
        }
    }
    
}

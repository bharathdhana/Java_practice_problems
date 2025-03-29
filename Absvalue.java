/* Calculating the Absolute value of given integer */

import java.util.Scanner;

public class Absvalue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        int a=sc.nextInt();

        //int absValue = Math.abs(a);
        int absValue = (a < 0) ? -a : a;

        System.out.println("Absolute Value: "+absValue);

    }
}

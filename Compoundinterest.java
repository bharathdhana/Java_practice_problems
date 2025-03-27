/* Calculate Compound interest */

import java.util.*;
public class Compoundinterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter Time in years: ");
        double time = scanner.nextDouble();

        double amount = principal*Math.pow((1+rate/100),time);
        double Compoundinterest = amount - principal;

        System.out.println("Compound interest: "+Compoundinterest);
        System.out.println("Total amount: "+amount);
        scanner.close();
    }
}

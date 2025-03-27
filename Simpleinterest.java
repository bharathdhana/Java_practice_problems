/* Calculate Simple interest */

import java.util.*;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter Time in years: ");
        double time = scanner.nextDouble();

        double Simpleinterest = (principal*rate*time)/100;
        System.out.println("Simple interest: "+Simpleinterest);
        scanner.close();
    }
    
}

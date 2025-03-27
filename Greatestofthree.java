/* Greatest of three Numbers */

import java.util.*;
public class Greatestofthree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter two number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter three number: ");
        int num3 = scanner.nextInt();

        int Greatest = (num1 > num2) ? (num2 > num3 ? num1 : num3) : (num1 > num3 ? num1 : num3);
        System.out.println("The greatest of three: "+Greatest);
        scanner.close();     
    }
    
}

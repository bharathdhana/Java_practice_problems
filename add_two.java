/* Program to add two numbers, print the result */

import java.util.*;

public class add_two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        int result = a + b;
        System.out.print("result: "+result);
        scanner.close();

    }
    
}

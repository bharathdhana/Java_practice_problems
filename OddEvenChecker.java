/* Odd or Even */

import java.util.*;
public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        if(number%2==0)
        {
            System.out.println(number + " is Odd ");
        } else {
            System.out.println(number + " is Even ");
        } 
        scanner.close();
    }
    
}
